package br.com.abware.jcondo.core.model;

public enum VehicleType implements BaseModel {

	CAR("vehicle.type.car"),
	MOTO("vehicle.type.moto"),
	BIKE("vehicle.type.bike");

	private String label;

	private VehicleType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	@Override
	public String toString() {
		return label;
	}

	@Override
	public long getId() {
		return ordinal();
	}

}
