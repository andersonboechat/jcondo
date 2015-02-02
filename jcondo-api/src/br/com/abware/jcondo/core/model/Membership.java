package br.com.abware.jcondo.core.model;

public class Membership {

	protected Role role;
	
	protected Domain domain;
	
	public Membership() {
	}

	public Membership(Role role, Domain domain) {
		this();
		this.role = role;
		this.domain = domain;
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}	
}
