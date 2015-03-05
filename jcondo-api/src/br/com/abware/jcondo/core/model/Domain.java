package br.com.abware.jcondo.core.model;

public class Domain implements BaseModel {

	protected long id;

	protected long parentId;
	
	protected long relatedId;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public long getRelatedId() {
		return relatedId;
	}

	public void setRelatedId(long domainId) {
		this.relatedId = domainId;
	}

	public boolean equals(Object obj) {
		return super.equals(obj) || (this.getClass().equals(obj.getClass()) && id == ((Domain) obj).getId());
	}
}
