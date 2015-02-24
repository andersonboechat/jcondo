package br.com.abware.jcondo.core.model;

public class Administration extends Domain {

	private String name;
	
	public Administration() {
	}

	public Administration(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || (obj instanceof Administration && name == ((Administration) obj).getName()));
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
}
