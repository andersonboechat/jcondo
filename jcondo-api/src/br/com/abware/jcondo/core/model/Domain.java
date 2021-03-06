package br.com.abware.jcondo.core.model;

public class Domain implements BaseModel {

	protected long id;

	protected long relatedId;
	
	protected long folderId;	
	
	protected Domain parent;

	public boolean equals(Object obj) {
		return super.equals(obj) || (this.getClass().equals(obj.getClass()) && id == ((Domain) obj).getId());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRelatedId() {
		return relatedId;
	}

	public void setRelatedId(long domainId) {
		this.relatedId = domainId;
	}

	public long getFolderId() {
		return folderId;
	}

	public void setFolderId(long forderId) {
		this.folderId = forderId;
	}

	public Domain getParent() {
		return parent;
	}

	public void setParent(Domain parent) {
		this.parent = parent;
	}

}
