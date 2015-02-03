package br.com.abware.jcondo.core.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.com.abware.jcondo.core.model.Condominium;
import br.com.abware.jcondo.core.model.Councillor;
import br.com.abware.jcondo.core.model.Domain;
import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Homeowner;
import br.com.abware.jcondo.core.model.Manager;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.model.Resident;
import br.com.abware.jcondo.core.model.Role;
import br.com.abware.jcondo.core.model.Supplier;
import br.com.abware.jcondo.core.model.Visitor;
import br.com.abware.jcondo.core.persistence.RoleManager;
import br.com.abware.jcondo.exception.ApplicationException;

@Stateless(name="roleService")
@Local(RoleService.class)
public class RoleServiceImpl implements RoleService {

	@EJB
	private RoleManager manager;

	
	@Override
	public List<Role<? extends Domain>> getRoles(Class<? extends Domain> domain) throws ApplicationException {
		List<Role<? extends Domain>> list = new ArrayList<Role<? extends Domain>>();

		if (Flat.class.equals(domain)) {
			list.add(new Resident());
			list.add(new Homeowner());
			list.add(new Visitor<Domain>(new Flat()));
		} else if (Condominium.class.equals(domain)) {
			list.add(new Manager<Condominium>(new Condominium()));
			list.add(new Councillor(new Condominium()));
			list.add(new Visitor<Domain>(new Flat()));
			
		} else if (Supplier.class.equals(domain)) {
			
		}
		
		return null;
	}

	@Override
	public Role<? extends Domain> getRole(Person person, Domain domain) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role<? extends Domain> save(Person person, Role<? extends Domain> role) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role<? extends Domain>> getRoles() throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role<? extends Domain>> getRoles(Person person)	throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

}
