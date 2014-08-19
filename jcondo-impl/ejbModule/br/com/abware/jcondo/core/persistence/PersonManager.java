package br.com.abware.jcondo.core.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.abware.jcondo.core.Permission;
import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.exception.PersistenceException;

@Local
public interface PersonManager extends ModelManager<Person> {

	public Person getLoggedPerson() throws PersistenceException;

	public List<Person> getPeople(Flat flat) throws PersistenceException;

	public boolean hasPermission(Person person, Permission permission);

}
