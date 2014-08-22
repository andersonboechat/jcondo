package br.com.abware.jcondo.crm.service;

import java.util.List;

import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.service.BaseService;
import br.com.abware.jcondo.crm.model.Occurrence;
import br.com.abware.jcondo.exception.ApplicationException;

public interface OccurrenceService extends BaseService<Occurrence>{

	public Occurrence getOccurrenceById(long id) throws ApplicationException;

	public List<Occurrence> getOccurrences(Person person) throws ApplicationException;
	
	public Occurrence register(Occurrence occurrence) throws ApplicationException;

}
