package br.com.abware.jcondo.core.service;

import java.util.List;

import br.com.abware.jcondo.core.model.Domain;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.model.Role;
import br.com.abware.jcondo.exception.ApplicationException;

public interface RoleService extends BaseService<Role> {

	public List<Role> getRoles(Class<? extends Domain> domain) throws ApplicationException;
	
	public List<Role> getRoles() throws ApplicationException;
	
	public List<Role> getRoles(Person person) throws ApplicationException;

	public Role getRole(Person person, Domain domain) throws ApplicationException;
	
	public Role save(Person person, Role role) throws ApplicationException;

}
