package br.com.abware.jcondo.core.persistence;

import java.util.List;

import br.com.abware.jcondo.core.model.BaseModel;
import br.com.abware.jcondo.exception.PersistenceException;

public interface ModelManager<Model extends BaseModel> {

	public Model save(Model model, long personId) throws PersistenceException;

	public Model findById(Object id) throws PersistenceException;
	
	public List<Model> findAll() throws PersistenceException;

}
