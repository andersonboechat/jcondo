package br.com.atilo.jcondo.core.service;

import java.util.List;

import br.com.atilo.jcondo.core.model.Domain;
import br.com.atilo.jcondo.core.model.Membership;
import br.com.atilo.jcondo.core.model.Person;
import br.com.atilo.jcondo.core.model.type.PersonType;

public interface MembershipService {

	public Membership add(Domain domain, Person person, PersonType type) throws Exception;

	public Membership remove(Domain domain, Person person, PersonType type) throws Exception;

	public Membership getMembership(Person person, Domain domain) throws Exception;

	public List<Membership> getMemberships(Person person) throws Exception;

}