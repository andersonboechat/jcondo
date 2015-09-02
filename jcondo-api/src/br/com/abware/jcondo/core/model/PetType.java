package br.com.abware.jcondo.core.model;

public enum PetType implements BaseModel {

	DOG("pet.type.dog"),
	CAT("pet.type.cat"),
	BIRD("pet.type.bird"),
	OTHER("pet.type.other");

	private String label;

	private PetType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	public long getId() {
		return ordinal();
	}

}
