package br.com.abware.jcondo.core.service;


import java.io.File;
import java.util.List;

import br.com.abware.jcondo.core.BaseRole;
import br.com.abware.jcondo.core.RolePermission;
import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.exception.ApplicationException;

public interface PersonService extends BaseService<Person> {

	public Person getPerson() throws ApplicationException;
	
	public List<Person> getPeople(Flat flat) throws ApplicationException;
	
	public BaseRole getRole(Flat flat);
	
	public void setPortrait(File file);
	
	public File getPortrait();
	
	public boolean isAllowed(RolePermission permission, Person person);

}
