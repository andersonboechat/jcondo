package br.com.abware.jcondo.core.service;

import java.io.File;
import java.util.List;

import br.com.abware.jcondo.core.Permission;
import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.exception.ApplicationException;

public interface PersonService extends BaseService<Person> {

	public Person register(Person person) throws ApplicationException;
	
	public Person getPerson() throws ApplicationException;
	
	public List<Person> getPeople(Flat flat) throws ApplicationException;
	
	public void setPortrait(File file);
	
	public File getPortrait();
	
	public boolean hasPermission(Person person, Permission permission) throws ApplicationException;

}
