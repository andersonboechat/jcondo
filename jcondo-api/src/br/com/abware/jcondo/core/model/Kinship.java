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
		this.person = person;
		this.relative = relative;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || 
			  (obj instanceof Kinship && ((Kinship) obj).getPerson().equals(person) && ((Kinship) obj).getRelative().equals(relative)) && ((Kinship) obj).getType().equals(type));
	}

	@Override
	public int hashCode() {
        long hash = 7;
        hash = 31 * hash + (null == person ? 0 : person.hashCode());
        hash = 31 * hash + (null == relative ? 0 : relative.hashCode());
        hash = 31 * hash + (null == type ? 0 : type.hashCode());
        return (int) hash;
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
