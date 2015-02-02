package br.com.abware.jcondo.core.model;

public class Image implements BaseModel {

	private long id;
	
	private String path;
	
	private String title;
	
	private String descrption;

	public Image() {
		super();
	}
	
	public Image(long id, String path, String title, String descrption) {
		this();
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

	public void setPath(String path) {
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	
}
