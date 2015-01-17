package br.com.abware.jcondo.core.service;

import java.io.File;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import org.apache.commons.collections.CollectionUtils;

import br.com.abware.jcondo.core.Permission;
import br.com.abware.jcondo.core.model.Domain;
import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.persistence.PersonManager;
import br.com.abware.jcondo.exception.ApplicationException;
import br.com.abware.jcondo.exception.BusinessException;
import br.com.abware.jcondo.exception.Message;
import br.com.abware.jcondo.exception.PersistenceException;


@Stateless(name="personService")
@Local(PersonService.class)
public class PersonServiceImpl implements PersonService {

	@EJB
	private PersonManager manager;

	@Override
	public Person getPerson() throws ApplicationException {
		return manager.getLoggedPerson();
	}

	@Override
	public List<Person> getPeople(Domain flat) throws ApplicationException {
		return manager.getPeople(flat);
	}

	@Override
	public void setPortrait(File file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public File getPortrait() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPermission(Person person, Permission permission) throws ApplicationException {
		return manager.hasPermission(person == null ? manager.getLoggedPerson() : person, permission);
	}

	@Override
	public Person register(Person person) throws ApplicationException {
		try {
			if (CollectionUtils.isEmpty(person.getFlats())) {
				throw new BusinessException("");
			}

			if (person.getHome() == null) {
				person.setHome(person.getFlats().get(0));
			}

			return manager.save(person);
		} catch (PersistenceException e) {
			throw new BusinessException(Message.OPERATION_NOT_ALLOWED.name());
		}
	}

	public void delete(Person person) {
	}


}
