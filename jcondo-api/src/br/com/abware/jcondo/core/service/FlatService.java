package br.com.abware.jcondo.core.service;

import java.util.List;

import br.com.abware.jcondo.core.BaseRole;
import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.exception.PersistenceException;

public interface FlatService extends BaseService<Flat> {

	public List<Flat> getFlats() throws PersistenceException;
	
	public List<Flat> getFlats(Person person) throws PersistenceException;
	
	public List<BaseRole> getRoles();

}
