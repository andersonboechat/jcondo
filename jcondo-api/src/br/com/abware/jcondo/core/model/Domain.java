package br.com.abware.jcondo.core.model;

public class Domain implements BaseModel {

	protected long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || id == ((Domain) obj).getId());
	}
}
