package br.com.abware.jcondo.booking.model;

import br.com.abware.jcondo.core.model.BaseModel;

public class Guest implements BaseModel {

	private long id;

	private String firstName;

	private String lastName;

	public Guest() {
	}
	
	public Guest(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || (obj instanceof Guest && ((Guest) obj).getId() == id));
	}
	
	@Override
	public int hashCode() {
        long hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + (null == firstName ? 0 : firstName.hashCode());
        hash = 31 * hash + (null == lastName ? 0 : lastName.hashCode());
        return (int) hash;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{id: ").append(id).append(", firstName:").append(firstName)
		  .append(", lastName:").append(lastName).append("}");
		return sb.toString();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
