package br.com.abware.jcondo.core.model;

public enum KinType {

	FATHER("kintype.father"),
	MOTHER("kintype.mother"),
	CHILD("kintype.child"),
	GRANDCHILD("kintype.grandchild"),
	SIBLING("kintype.sibling");

	private String label;

	private KinType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
}
