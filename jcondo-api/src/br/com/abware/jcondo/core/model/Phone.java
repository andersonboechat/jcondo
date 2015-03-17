package br.com.abware.jcondo.core.model;

public class Phone implements BaseModel {

	private long id;

	private String extension;
	
	private String number;

	private PhoneType type;

	public Phone() {
	}

	public Phone(String extension, String number, PhoneType type) {
		this.extension = extension;
		this.number = number;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public PhoneType getType() {
		return type;
	}

	public void setType(PhoneType type) {
		this.type = type;
	}

}
