package br.com.abware.jcondo.persistence.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import br.com.abware.jcondo.core.model.BaseModel;
import br.com.abware.jcondo.exception.PersistenceException;

import com.liferay.portal.model.PersistedModel;

public abstract class AbstractManager<Entity extends PersistedModel, Model extends BaseModel> {

	protected abstract Class<Model> getModelClass();

	protected abstract Entity getEntity(Model model) throws PersistenceException;
	
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

}
