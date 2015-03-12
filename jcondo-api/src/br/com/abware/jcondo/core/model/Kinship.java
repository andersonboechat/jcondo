package br.com.abware.jcondo.core.model;

public class Kinship implements BaseModel {

	private long id;
	
	private Person person;
	
	private Person relative;
	
	private KinType type;

	public Kinship() {
		// TODO Auto-generated constructor stub
	}

	public Kinship(Person person, Person relative, KinType type) {
		this.relative = relative;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
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
