package br.com.abware.jcondo.core.model;

import br.com.abware.jcondo.core.PersonType;

public class Membership implements BaseModel {

	private static final long serialVersionUID = 495096862388184994L;

	private long id;
	
	private PersonType type;
	
	private Domain domain;
	
	public Membership() {
	}

	public Membership(PersonType type, Domain domain) {
		this();
		this.type = type;
		this.domain = domain;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || 
			  (obj instanceof Membership && ((Membership) obj).getDomain().equals(domain) && ((Membership) obj).getType().equals(type)));
	}

	@Override
	public int hashCode() {
        long hash = 7;
        hash = 31 * hash + (null == type ? 0 : type.hashCode());
        hash = 31 * hash + (null == domain ? 0 : domain.hashCode());
        return (int) hash;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{domain:").append(domain).append(", type:").append(type).append("}");
		return super.toString();
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return this.id;
	}	

	public PersonType getType() {
		return type;
	}

	public void setType(PersonType type) {
		this.type = type;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

}
