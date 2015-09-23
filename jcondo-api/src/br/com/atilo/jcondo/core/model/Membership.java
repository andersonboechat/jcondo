package br.com.atilo.jcondo.core.model;

import br.com.atilo.jcondo.core.model.type.PersonType;

public interface Membership extends Model {

	public Person getPerson();

	public void setPerson(Person person);
	
	public Domain getDomain();

	public void setDomain(Domain domain);

	public PersonType getType();

	public void setType(PersonType type);

}
