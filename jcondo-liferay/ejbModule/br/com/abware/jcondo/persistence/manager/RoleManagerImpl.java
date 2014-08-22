package br.com.abware.jcondo.persistence.manager;

import java.util.List;

import com.liferay.portal.service.RoleLocalServiceUtil;

import br.com.abware.jcondo.core.RoleType;
import br.com.abware.jcondo.core.model.Role;
import br.com.abware.jcondo.core.persistence.RoleManager;
import br.com.abware.jcondo.exception.PersistenceException;

public class RoleManagerImpl extends AbstractManager<com.liferay.portal.model.Role, Role> implements RoleManager {

	@Override
	public Role save(Role model) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role findById(Object id) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> findAll() throws PersistenceException {
		return null;
	}

	@Override
	public List<Role> findByRoleType(RoleType type) throws PersistenceException {
		try {
			return getModels(RoleLocalServiceUtil.getRoles(type.ordinal(), null));
		} catch (Exception e) {
			throw new PersistenceException("");
		}
	}

	public Role getModel(com.liferay.portal.model.Role role) throws PersistenceException {
		Role r = super.getModel(role);
		r.setId(role.getRoleId());
		return r;
	}

	@Override
	protected Class<Role> getModelClass() {
		return Role.class;
	}

	@Override
	protected com.liferay.portal.model.Role getEntity(Role role) throws PersistenceException {
		try {
			return RoleLocalServiceUtil.getRole(role.getId());
		} catch (Exception e) {
			throw new PersistenceException("");
		}
	}

}
