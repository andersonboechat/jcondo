package br.com.abware.jcondo.persistence.manager;

import java.util.List;

import javax.ejb.Stateless;

import org.apache.commons.beanutils.BeanUtils;

import com.liferay.portal.model.Organization;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portlet.expando.model.ExpandoTableConstants;
import com.liferay.portlet.expando.model.ExpandoValue;
import com.liferay.portlet.expando.service.ExpandoValueLocalServiceUtil;

import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.persistence.FlatManager;
import br.com.abware.jcondo.exception.PersistenceException;

@Stateless
public class FlatManagerImpl extends AbstractManager<Organization, Flat> implements FlatManager {

	private static final String BLOCK = "BLOCK";
	
	private static final String NUMBER = "NUMBER";
	
	private String getCustomField(String fieldName, Organization organization) throws Exception {
		return (String) ExpandoValueLocalServiceUtil.getData(organization.getCompanyId(), 
														     organization.getClass().getName(), 
														     ExpandoTableConstants.DEFAULT_TABLE_NAME, 
														     fieldName, 
														     organization.getOrganizationId());
	}

	private void saveCustomField(String fieldName, String fieldValue, Organization organization) throws Exception {
		ExpandoValue value = ExpandoValueLocalServiceUtil.getValue(organization.getCompanyId(), 
																   organization.getClass().getName(), 
																   ExpandoTableConstants.DEFAULT_TABLE_NAME, 
																   fieldName, 
																   organization.getOrganizationId());

		if(value == null) {
			ExpandoValueLocalServiceUtil.addValue(organization.getCompanyId(), 
												  organization.getClass().getName(), 
												  ExpandoTableConstants.DEFAULT_TABLE_NAME, 
												  fieldName, 
												  organization.getOrganizationId(),
												  fieldValue);
		} else {
			value.setData(fieldValue);
			ExpandoValueLocalServiceUtil.updateExpandoValue(value);
		}
	}

	@Override
	protected Class<Flat> getModelClass() {
		return Flat.class;
	}

	@Override
	protected Organization getEntity(Flat flat) throws PersistenceException {
		try {
			Organization organization;

			if (flat.getId() == 0) {
				organization = OrganizationLocalServiceUtil.getOrganization(flat.getId());
			} else {
				organization = OrganizationLocalServiceUtil.createOrganization(flat.getId());	
			}

			BeanUtils.copyProperties(organization, flat);

			return organization;
		} catch (Exception e) {
			throw new PersistenceException(e, "");
		}
	}
	
	public Flat getModel(Organization organization) throws Exception {
		Flat flat = super.getModel(organization);
		flat.setId(organization.getOrganizationId());
		flat.setBlock(Integer.parseInt(getCustomField(BLOCK, organization)));
		flat.setNumber(Integer.parseInt(getCustomField(NUMBER, organization)));
		return flat;
	}

	@Override
	public Flat save(Flat flat) throws PersistenceException {
		try {
			Organization organization = getEntity(flat);
			organization.persist();

			saveCustomField(BLOCK, String.valueOf(flat.getBlock()), organization);
			saveCustomField(NUMBER, String.valueOf(flat.getNumber()), organization);

			return getModel(organization);
		} catch (Exception e) {
			throw new PersistenceException(e, "");
		}
	}

	@Override
	public Flat findById(Object id) throws PersistenceException {
		try {
			return getModel(OrganizationLocalServiceUtil.getOrganization((Long) id));
		} catch (Exception e) {
			throw new PersistenceException(e, "");
		}
	}

	@Override
	public List<Flat> findAll() throws PersistenceException {
		try {
			return getModels(OrganizationLocalServiceUtil.getOrganizations(-1, -1));
		} catch (Exception e) {
			throw new PersistenceException(e, "");
		}
	}

	@Override
	public List<Flat> findByPerson(Person person) throws PersistenceException {
		try {
			return getModels(OrganizationLocalServiceUtil.getUserOrganizations(person.getId()));
		} catch (Exception e) {
			throw new PersistenceException(e, "");
		}
	}
}
