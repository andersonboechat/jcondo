package br.com.atilo.jcondo.core.model;

import br.com.atilo.jcondo.core.model.type.VehicleType;

public interface Vehicle extends Model {

	public String getName();

	public void setName(String name);

	public String getBrand();

	public void setBrand(String brand);

	public String getLicense();

	public void setLicense(String license);

	public VehicleType getType();

	public void setType(VehicleType type);

	public Image getImage();

	public void setImage(Image image);

	public Domain getDomain();

	public void setDomain(Domain domain);

}