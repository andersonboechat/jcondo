package br.com.abware.jcondo.core.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.persistence.FlatManager;
import br.com.abware.jcondo.exception.BusinessException;
import br.com.abware.jcondo.exception.PersistenceException;

@Stateless(name="flatService")
@Local(FlatService.class)
public class FlatServiceImpl implements FlatService {

	@EJB
	private FlatManager flatManager;
	
	public List<Flat> getFlats() throws BusinessException {
		return flatManager.findAll();
	}
	
	@Override
	public List<Flat> getFlats(Person person) throws BusinessException {
		return flatManager.findByPerson(person);
	}

	public void save(Flat bean) {
		// TODO Auto-generated method stub
	}

	public void delete(Flat bean) {
		// TODO Auto-generated method stub
	}

}
