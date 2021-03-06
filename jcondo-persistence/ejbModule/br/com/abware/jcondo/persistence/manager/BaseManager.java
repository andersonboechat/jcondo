package br.com.abware.jcondo.persistence.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.beanutils.BeanUtils;

import br.com.abware.jcondo.core.model.BaseModel;
import br.com.abware.jcondo.core.persistence.ModelManager;
import br.com.abware.jcondo.core.persistence.PersonManager;
import br.com.abware.jcondo.exception.PersistenceException;
import br.com.abware.jcondo.persistence.entity.BaseEntity;

public abstract class BaseManager<Entity extends BaseEntity, Model extends BaseModel> implements ModelManager<Model> {

	@PersistenceContext(name="jcondo-persistence")
	protected EntityManager em;
	
	@EJB
	protected PersonManager personManager;	

	protected abstract Class<Entity> getEntityClass();

	protected abstract Class<Model> getModelClass();

	protected Entity getEntity(Model model) throws PersistenceException {
		try {
			Entity entity = getEntityClass().newInstance();
			BeanUtils.copyProperties(entity, model);
			return entity;
		} catch (Exception e) {
			throw new PersistenceException("model.entity.convert.exception", e);
		}
	}

	protected Model getModel(Entity entity) throws PersistenceException {
		try {
			Model model = getModelClass().newInstance();
			BeanUtils.copyProperties(model, entity);
			return model;
		} catch (Exception e) {
			throw new PersistenceException("entity.model.convert.exception", e);
		}
	}

	protected List<Model> getModels(List<Entity> entities) throws PersistenceException {
		try {
			List<Model> models = new ArrayList<Model>();
			for (Entity entity : entities) {
				models.add(getModel(entity));
			}
			return models;
		} catch (Exception e) {
			throw new PersistenceException("entities.models.convert.exception", e);
		}		
	}	

	protected Entity save(Entity entity) throws PersistenceException {
		try {
			Date date = new Date();
			Date createDate = entity.getCreateDate();
			entity.setAgentId(personManager.getLoggedPerson().getId());
			entity.setModifiedDate(date);

			try {
				entity.setCreateDate(date);
				em.persist(entity);
				em.flush();
			} catch (EntityExistsException e) {
				entity.setCreateDate(createDate);
				em.merge(entity);
				em.flush();
			}

		} catch (javax.persistence.PersistenceException e) {
			em.getTransaction().rollback();
			throw new PersistenceException("", e);
		}

		return entity;
	}

	public Model save(Model model) throws PersistenceException {
		return getModel(save(getEntity(model)));
	}

	public Model findById(Object id) throws PersistenceException {
		return getModel(em.find(getEntityClass(), id));
	}

	@SuppressWarnings("unchecked")
	public List<Model> findAll() throws PersistenceException {
		String query = "FROM " + getEntityClass().getSimpleName();
		Query q = em.createQuery(query);
		return getModels(q.getResultList());
	}

}
