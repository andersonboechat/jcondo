package br.com.abware.jcondo.core;

public enum Gender {

	MALE("gender.male"),
	FEMALE("gender.female");

	private String label;

	private Gender(String label) {
		this.setLabel(label);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
