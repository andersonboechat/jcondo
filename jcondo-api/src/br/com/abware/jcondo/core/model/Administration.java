package br.com.abware.jcondo.core.model;

public class Administration extends Domain {

	private String name;
	
	public Administration() {
	}

	public Administration(long id, String name) {
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
