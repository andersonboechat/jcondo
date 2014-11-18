package br.com.abware.jcondo.core.model;

import br.com.abware.jcondo.core.Organization;

public class Roleship {

	private Person person;
	
	private Organization organization;
	
	private Role role;

	public Roleship(Person person, Organization organization, Role role) {
		super();
		this.person = person;
		this.organization = organization;
		this.role = role;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
