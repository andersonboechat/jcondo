package br.com.abware.jcondo.persistence.manager;

import java.util.List;

import javax.ejb.Stateless;

import com.liferay.portal.model.Organization;
import com.liferay.portal.service.OrganizationLocalServiceUtil;

import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.persistence.FlatManager;
import br.com.abware.jcondo.exception.PersistenceException;

@Stateless
public class FlatManagerImpl extends AbstractManager<Organization, Flat> implements FlatManager {
	
	@Override
	protected Class<Flat> getModelClass() {
		return Flat.class;
	}

	@Override
	protected Organization getEntity(Flat flat) throws PersistenceException {
		try {
			return OrganizationLocalServiceUtil.getOrganization(flat.getId());
		} catch (Exception e) {
			throw new PersistenceException("", e);
		}
	}
	
	protected Flat getModel(Organization organization) throws PersistenceException {
		Flat flat = super.getModel(organization);
		flat.setId(organization.getOrganizationId());
		return flat;
	}

	@Override
	public Flat save(Flat flat, long personId) throws PersistenceException {
		try {
			Organization organization;

			if (flat.getId() == 0) {
				organization = OrganizationLocalServiceUtil.addOrganization(getEntity(flat));
			} else {
				organization = getEntity(flat);
				organization.persist();
			}

			return getModel(organization);
		} catch (Exception e) {
			throw new PersistenceException("", e);
		}
	}

	@Override
	public Flat findById(Object id) throws PersistenceException {
		try {
			return getModel(OrganizationLocalServiceUtil.getOrganization((Long) id));
		} catch (Exception e) {
			throw new PersistenceException("", e);
		}
	}

	@Override
	public List<Flat> findAll() throws PersistenceException {
		try {
			//int amount = OrganizationLocalServiceUtil.getOrganizationsCount();
			return getModels(OrganizationLocalServiceUtil.getOrganizations(-1, -1));
		} catch (Exception e) {
			throw new PersistenceException("", e);
		}
	
	}

	@Override
	public List<Flat> findByPerson(Person person) throws PersistenceException {
		try {
			return getModels(OrganizationLocalServiceUtil.getUserOrganizations(person.getId()));
		} catch (Exception e) {
			throw new PersistenceException("", e);
		}
	}
}
