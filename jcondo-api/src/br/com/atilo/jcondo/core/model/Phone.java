package br.com.atilo.jcondo.core.model;

import br.com.atilo.jcondo.core.model.type.PhoneType;

public interface Phone extends Model {

	public String getExtension();

	public void setExtension(String extension);

	public String getNumber();

	public void setNumber(String number);

	public PhoneType getType();

	public void setType(PhoneType type);

	public boolean isPrimary();

	public void setPrimary(boolean primary);

}
