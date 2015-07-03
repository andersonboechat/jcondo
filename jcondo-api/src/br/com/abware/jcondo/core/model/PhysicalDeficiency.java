package br.com.abware.jcondo.core.model;

public class PhysicalDeficiency implements BaseModel {

	private long id;
	
	private DeficiencyType type;
	
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DeficiencyType getType() {
		return type;
	}

	public void setType(DeficiencyType type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
