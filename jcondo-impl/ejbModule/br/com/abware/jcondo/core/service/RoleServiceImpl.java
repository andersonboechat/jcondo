package br.com.abware.jcondo.core.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.com.abware.jcondo.core.RoleType;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.model.Role;
import br.com.abware.jcondo.core.persistence.RoleManager;
import br.com.abware.jcondo.exception.ApplicationException;

@Stateless(name="roleService")
@Local(RoleService.class)
public class RoleServiceImpl implements RoleService {

	@EJB
	private RoleManager manager;
	
	@Override
	public List<Role> getRoles(RoleType type) throws ApplicationException {
		return manager.findByRoleType(type);
	}

	@Override
	public List<Role> getRoles() throws ApplicationException {
		return manager.findAll();
	}

	@Override
	public List<Role> getRoles(Person person) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

}
