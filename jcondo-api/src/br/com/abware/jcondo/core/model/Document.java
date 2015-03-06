package br.com.abware.jcondo.core.model;

import br.com.abware.jcondo.core.model.BaseModel;

public class Document implements BaseModel {

	private long id;
	
	private String name;

	private String path;
	
	private Domain domain;
	
	public Document() {
	}

	public Document(long id, String name, String path) {
		super();
		this.id = id;
		this.name = name;
		this.path = path;
	}

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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

}
