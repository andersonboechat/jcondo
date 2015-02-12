package br.com.abware.jcondo.core.model;

public class Domain implements BaseModel {

	protected long id;
	
	protected long domainId;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDomainId() {
		return domainId;
	}

	public void setDomainId(long domainId) {
		this.domainId = domainId;
	}

	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || id == ((Domain) obj).getId());
	}
}
