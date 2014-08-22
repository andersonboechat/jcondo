package br.com.abware.jcondo.core.model;

import br.com.abware.jcondo.core.RoleType;

public class Role implements BaseModel {

	private long id;
	
	private String title;
	
	private RoleType type;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	public RoleType getType() {
		return type;
	}

}
