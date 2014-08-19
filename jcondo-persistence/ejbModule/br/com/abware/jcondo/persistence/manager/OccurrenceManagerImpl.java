package br.com.abware.jcondo.persistence.manager;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.abware.jcondo.crm.persistence.OccurrenceManager;
import br.com.abware.jcondo.exception.PersistenceException;
import br.com.abware.jcondo.persistence.entity.Occurrence;

@Stateless
public class OccurrenceManagerImpl extends BaseManager<Occurrence, br.com.abware.jcondo.crm.model.Occurrence> implements OccurrenceManager {
	
	@SuppressWarnings("unchecked")
	public List<br.com.abware.jcondo.crm.model.Occurrence> findOccurrencesByPersonId(long personId) throws PersistenceException {
		String queryString = "FROM Occurrence WHERE userId = :userId ORDER BY date DESC";
		Query query = em.createQuery(queryString);
		query.setParameter("userId", personId);
		List<Occurrence> occurrences = query.getResultList();
		return getModels(occurrences);
	}

	@Override
	protected Class<Occurrence> getEntityClass() {
		return Occurrence.class;
	}

	@Override
	protected Class<br.com.abware.jcondo.crm.model.Occurrence> getModelClass() {
		return br.com.abware.jcondo.crm.model.Occurrence.class;
	}

}
