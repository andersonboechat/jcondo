package br.com.abware.jcondo.core.model;

public class Supplier extends Domain {

	private String name;

	public Supplier() {
		// TODO Auto-generated constructor stub
	}

	public Supplier(long id, String name) {
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
