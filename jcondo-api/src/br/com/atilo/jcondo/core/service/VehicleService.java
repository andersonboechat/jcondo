package br.com.atilo.jcondo.core.service;

import java.util.List;

import br.com.atilo.jcondo.core.model.Domain;
import br.com.atilo.jcondo.core.model.Image;
import br.com.atilo.jcondo.core.model.Person;
import br.com.atilo.jcondo.core.model.Vehicle;
import br.com.atilo.jcondo.core.model.type.VehicleType;

public interface VehicleService {

	public Person add(String name, String brand, String license, VehicleType type, Image image, Domain domain) throws Exception;

	public Person update(long id, String name, String brand, String license, VehicleType type, Image image, Domain domain) throws Exception;

	public Person remove(long id, Domain domain) throws Exception;

	public List<VehicleType> getTypes(Domain domain) throws Exception;
	
	public Vehicle getVehicle(long id) throws Exception;

	public Vehicle getVehicle(String license) throws Exception;

	public List<Vehicle> getVehicles(Person person) throws Exception;

	public List<Vehicle> getVehicles(Domain domain) throws Exception;

	public List<Vehicle> getVehicles() throws Exception;

}