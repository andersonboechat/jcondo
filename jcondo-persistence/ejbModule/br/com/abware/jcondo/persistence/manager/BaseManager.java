package br.com.abware.jcondo.persistence.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.beanutils.BeanUtils;

import br.com.abware.jcondo.core.model.BaseModel;
import br.com.abware.jcondo.core.persistence.ModelManager;
import br.com.abware.jcondo.exception.PersistenceException;
import br.com.abware.jcondo.persistence.entity.BaseEntity;

public abstract class BaseManager<Entity extends BaseEntity, Model extends BaseModel> implements ModelManager<Model> {

	@PersistenceContext(name="jcondo-persistence")
	protected EntityManager em;

	protected abstract Class<Entity> getEntityClass();

	protected abstract Class<Model> getModelClass();

	protected Entity getEntity(Model model) throws PersistenceException {
		try {
			Entity entity = getEntityClass().newInstance();
			BeanUtils.copyProperties(entity, model);
			return entity;
		} catch (Exception e) {
			throw new PersistenceException();
		}
	}

	protected Model getModel(Entity entity) throws PersistenceException {
		try {
			Model model = getModelClass().newInstance();
			BeanUtils.copyProperties(model, entity);
			return model;
		} catch (Exception e) {
			throw new PersistenceException();
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
			throw new PersistenceException();
		}		
	}	

	protected Entity save(Entity entity, long agentId) throws PersistenceException {
		try {
			Date date = new Date();
			Date createDate = entity.getCreateDate(); 
			entity.setAgentId(agentId);
			entity.setModifiedDate(date);

			try {
				entity.setCreateDate(date);
				em.persist(entity);
			} catch (EntityExistsException e) {
				entity.setCreateDate(createDate);
				em.merge(entity);
			}

			em.flush();
			em.refresh(entity);
		} catch (javax.persistence.PersistenceException e) {
			em.getTransaction().rollback();
			throw new PersistenceException();
		}

		return entity;
	}

	public Model save(Model model, long agentId) throws PersistenceException {
		save(getEntity(model), agentId);
		return model;
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
