package br.com.atilo.jcondo.core.model.type;

public enum ParkingType {

	RESIDENT("parking.type.resident"),
	VISITOR("parking.type.visitor");

	private String label;

	private ParkingType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	@Override
	public String toString() {
		return label;
	}

}
