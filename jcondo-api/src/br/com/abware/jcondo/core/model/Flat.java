package br.com.abware.jcondo.core.model;

import br.com.abware.jcondo.core.Organization;


public class Flat extends Organization implements BaseModel {
	
	private long id;
	
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
