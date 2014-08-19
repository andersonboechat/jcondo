package br.com.abware.jcondo.core.model;

public class Image implements BaseModel {

	private long id;
	
	private String path;
	
	private String title;
	
	private String descrption;

	public Image(long id, String path, String title, String descrption) {
		super();
		this.id = id;
		this.path = path;
		this.title = title;
		this.descrption = descrption;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getPath() {
		return path;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return descrption;
	}
	
}
