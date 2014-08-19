package br.com.abware.jcondo.core.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.exception.PersistenceException;

@Local
public interface FlatManager extends ModelManager<Flat> {

	public List<Flat> findByPerson(Person person) throws PersistenceException;

}
