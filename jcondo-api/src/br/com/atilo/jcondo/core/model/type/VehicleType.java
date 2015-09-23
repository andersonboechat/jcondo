package br.com.atilo.jcondo.core.model.type;

import br.com.atilo.jcondo.core.model.Model;

public enum VehicleType implements Model {

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

	@Override
	public void setId(long id) {
	}

}
