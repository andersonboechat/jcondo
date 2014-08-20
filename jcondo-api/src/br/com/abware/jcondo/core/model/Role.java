package br.com.abware.jcondo.core.model;

public class Role implements BaseModel {

	private long id;
	
	private String title;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

}
