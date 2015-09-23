package br.com.atilo.jcondo.core.model.type;

public enum KinType {

	PARENT("kin.type.parent"),
	SPOUSE("kin.type.spouse"),
	FATHER("kin.type.father"),
	MOTHER("kin.type.mother"),
	CHILD("kin.type.child"),
	GRANDCHILD("kin.type.grandchild"),
	SIBLING("kin.type.sibling"),
	OTHER("kin.type.other");

	private String label;

	private KinType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
}
