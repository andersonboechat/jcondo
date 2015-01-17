package br.com.abware.jcondo.core.service;

import java.util.List;

import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.exception.BusinessException;

public interface FlatService extends BaseService<Flat> {

	public List<Flat> getFlats() throws BusinessException;
	
	public List<Flat> getFlats(Person person) throws BusinessException;
	
}
