package br.com.abware.jcondo.core.model;

public class Kinship implements BaseModel {

	private long id;
	
	private Person relative;
	
	private KinType type;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Person getRelative() {
		return relative;
	}

	public void setRelative(Person relative) {
		this.relative = relative;
	}

	public KinType getType() {
		return type;
	}

	public void setType(KinType type) {
		this.type = type;
	}

}
