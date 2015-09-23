package br.com.atilo.jcondo.core.model.type;

import br.com.atilo.jcondo.core.model.Model;

public enum PetType implements Model {

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

	@Override
	public void setId(long id) {
	}

}
