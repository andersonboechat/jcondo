package br.com.atilo.jcondo.core.service;

import java.util.Date;
import java.util.List;

import br.com.atilo.jcondo.core.model.Domain;
import br.com.atilo.jcondo.core.model.Person;
import br.com.atilo.jcondo.core.model.Phone;
import br.com.atilo.jcondo.core.model.type.Gender;
import br.com.atilo.jcondo.core.model.type.KinType;
import br.com.atilo.jcondo.core.model.type.PersonType;

public interface PersonService {

	public Person add(String identity, String name, String surname, 
			 		  Gender gender, Date birthday, String email, Phone phone, 
			 		  Domain domain, PersonType personType, KinType kintype) throws Exception;
	
	public Person update(long id, String identity, String name, String surname, 
						 Gender gender, Date birthday, String email, Phone phone, 
						 Domain domain, PersonType personType, KinType kintype) throws Exception;

	public void remove(long id) throws Exception;

	public List<Person> getPeople(Domain domain) throws Exception;
	
	public List<PersonType> getTypes(Domain domain) throws Exception;

}