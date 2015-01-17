package br.com.abware.jcondo.core.model;

public abstract class Role<D extends Domain> implements BaseModel {

	protected long id;
	
	protected String title;
	
	protected D domain;

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

	public D getDomain() {
		return domain;
	}

	public void setDomain(D domain) {
		this.domain = domain;
	}

}
