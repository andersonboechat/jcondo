package br.com.abware.jcondo.core.service;

import java.io.File;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.com.abware.jcondo.core.BaseRole;
import br.com.abware.jcondo.core.RolePermission;
import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.persistence.PersonManager;
import br.com.abware.jcondo.exception.ApplicationException;


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
	public List<Person> getPeople(Flat flat) throws ApplicationException {
		return manager.getPeople(flat);
	}

	@Override
	public BaseRole getRole(Flat flat) {
//		FlatRole flatRole = null;
//		try {
//			Organization organization = ((FlatImpl) flat).getOrganization();
//
//			if (organization != null && organization.getGroup() != null) {
//				List<UserGroupRole> roles = UserGroupRoleLocalServiceUtil.getUserGroupRoles(getId(), 
//																			   				organization.getGroup().getGroupId());
//
//				if (!roles.isEmpty()) {
//					flatRole = new FlatRole(roles.get(0).getRole()); 
//				} else {
//					Role role = RoleLocalServiceUtil.getRole(organization.getCompanyId(), RoleConstants.ORGANIZATION_USER);
//					flatRole = new FlatRole(role); 
//				}
//			}
//		} catch (PortalException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SystemException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		return null;
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
	public boolean isAllowed(RolePermission permission, Person person) {
		return manager.hasPermission(person, permission);
	}

	public void save(Person person) throws ApplicationException {
		manager.save(person, manager.getLoggedPerson().getId());
	}

	public void delete(Person person) {
	}

}
