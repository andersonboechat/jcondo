package br.com.abware.jcondo.access.model;

import java.util.Date;

import br.com.abware.jcondo.core.model.Domain;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.model.Vehicle;

public class PassageEvent extends Event {

	private PassageType type;
	
	private Person person;

	private Vehicle vehicle;
	
	private Domain destiny;
	
	private Person authorizer;

	public PassageEvent(Date date, String comment, PassageType type, Person person, Vehicle vehicle, Domain destiny, Person authorizer) {
		super(date, comment);
		this.type = type;
		this.person = person;
		this.destiny = destiny;
		this.authorizer = authorizer;
	}

	public PassageType getType() {
		return type;
	}

	public void setType(PassageType type) {
		this.type = type;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Domain getDestiny() {
		return destiny;
	}

	public void setDestiny(Domain destiny) {
		this.destiny = destiny;
	}

	public Person getAuthorizer() {
		return authorizer;
	}

	public void setAuthorizer(Person authorizer) {
		this.authorizer = authorizer;
	}

	
}
