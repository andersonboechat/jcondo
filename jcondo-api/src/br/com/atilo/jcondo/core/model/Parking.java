package br.com.atilo.jcondo.core.model;

import br.com.atilo.jcondo.core.model.type.ParkingType;

public interface Parking extends Model {

	public String getCode();

	public void setCode(String code);

	public ParkingType getType();

	public void setType(ParkingType type);

	public Domain getOwner();

	public void setOwner(Domain domain);

	public Domain getRenter();

	public void setRenter(Domain renterDomain);

	public Vehicle getVehicle();

	public void setVehicle(Vehicle vehicle);
	
}