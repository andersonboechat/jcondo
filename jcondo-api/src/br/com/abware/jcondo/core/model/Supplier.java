package br.com.abware.jcondo.core.model;

import br.com.abware.jcondo.core.SupplierStatus;

public class Supplier extends Domain {

	private String name;
	
	private String description;

	private SupplierStatus status;
	
	private String identity;
	
	private Image picture;

	public Supplier() {
	}

	public Supplier(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || (obj instanceof Supplier && name == ((Supplier) obj).getName()));
	}

	@Override
	public int hashCode() {
        long hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + (null == name ? 0 : name.hashCode());
        return (int) hash;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{id: ").append(id).append(", name:").append(name).append("}");
		return sb.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SupplierStatus getStatus() {
		return status;
	}

	public void setStatus(SupplierStatus status) {
		this.status = status;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public Image getPicture() {
		return picture;
	}

	public void setPicture(Image picture) {
		this.picture = picture;
	}
	
}
