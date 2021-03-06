package br.com.abware.jcondo.core.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.abware.jcondo.core.DomainType;
import br.com.abware.jcondo.core.model.Role;
import br.com.abware.jcondo.exception.PersistenceException;

@Local
public interface RoleManager extends ModelManager<Role> {

	public List<Role> findByRoleType(DomainType type) throws PersistenceException;

}
