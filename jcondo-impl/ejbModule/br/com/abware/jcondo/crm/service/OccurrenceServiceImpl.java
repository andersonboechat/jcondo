package br.com.abware.jcondo.crm.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.persistence.PersonManager;
import br.com.abware.jcondo.crm.model.Occurrence;
import br.com.abware.jcondo.crm.persistence.OccurrenceManager;
import br.com.abware.jcondo.exception.ApplicationException;

@Stateless(name="occurrenceService")
@Local(OccurrenceService.class)
public class OccurrenceServiceImpl implements OccurrenceService {

	@EJB
	private OccurrenceManager occurrenceManager;
	
	@EJB
	private PersonManager personManager;	

	public Occurrence create(Occurrence occurrence) throws ApplicationException {
		return occurrenceManager.save(occurrence, personManager.getLoggedPerson().getId());
	}

	public void delete(Occurrence occurrence) throws ApplicationException {
		// TODO Auto-generated method stub
	}

	@Override
	public Occurrence getOccurrenceById(long id) throws ApplicationException {
		return occurrenceManager.findById(id);
	}

	@Override
	public List<Occurrence> getOccurrences(Person person) throws ApplicationException {
		return occurrenceManager.findOccurrencesByPersonId(person.getId());
	}

}
