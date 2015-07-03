package br.com.abware.jcondo.core.model;

public class Pet implements BaseModel {

	private long id;

	private PetType type;
	
	private String description;
	
	private Domain domain;
	
	private Image picture;
	
	public Pet() {}

	public Pet(PetType type, String description, Domain domain) {
		super();
		this.type = type;
		this.description = description;
		this.domain = domain;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PetType getType() {
		return type;
	}

	public void setType(PetType type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public Image getPicture() {
		return picture;
	}

	public void setPicture(Image picture) {
		this.picture = picture;
	}
	

}
