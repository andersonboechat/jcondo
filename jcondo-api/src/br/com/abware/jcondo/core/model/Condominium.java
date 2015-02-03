package br.com.abware.jcondo.core.model;

public class Condominium extends Domain {

	private String name;
	
	public Condominium() {
		// TODO Auto-generated constructor stub
	}

	public Condominium(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
