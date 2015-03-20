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

	@Override
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) ||	(obj instanceof Phone && ((Phone) obj).getExtension().equals(extension) && ((Phone) obj).getNumber().equals(number)));
	}

	@Override
	public int hashCode() {
        long hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + (null == extension ? 0 : extension.hashCode());
        hash = 31 * hash + (null == number ? 0 : number.hashCode());
        return (int) hash;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{id: ").append(id).append(", extension:").append(extension)
		  .append(", number:").append(number).append(", type:").append(type).append("}");
		return sb.toString();
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
