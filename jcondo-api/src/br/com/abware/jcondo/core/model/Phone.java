package br.com.abware.jcondo.core.model;

public class Phone implements BaseModel {

	private long id;

	private long number;

	private PhoneType type;

	public Phone() {
	}

	public Phone(long number, PhoneType type) {
		this.number = number;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public PhoneType getType() {
		return type;
	}

	public void setType(PhoneType type) {
		this.type = type;
	}

}
