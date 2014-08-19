package br.com.abware.jcondo.crm.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.abware.jcondo.core.persistence.ModelManager;
import br.com.abware.jcondo.crm.model.Occurrence;
import br.com.abware.jcondo.exception.PersistenceException;

@Local
public interface OccurrenceManager extends ModelManager<Occurrence> {

	public List<Occurrence> findOccurrencesByPersonId(long personId) throws PersistenceException;

}
