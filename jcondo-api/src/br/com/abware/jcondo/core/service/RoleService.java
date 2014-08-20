package br.com.abware.jcondo.core.service;

import java.util.List;

import br.com.abware.jcondo.core.RoleType;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.model.Role;
import br.com.abware.jcondo.exception.ApplicationException;

public interface RoleService extends BaseService<Role> {

	public List<Role> getRoles(RoleType type) throws ApplicationException;
	
	public List<Role> getRoles() throws ApplicationException;
	
	public List<Role> getRoles(Person person) throws ApplicationException;

}
