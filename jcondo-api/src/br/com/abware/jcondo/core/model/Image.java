package br.com.abware.jcondo.core.model;

public class Image extends Archive {

	private long id;
	
	private long folder;
	
	private String path;
	
	private String name;
	
	private String description;

	public Image() {
		super();
	}
	
	public Image(long id, long folder, String path, String name, String description) {
		this();
		this.id = id;
		this.folder = folder;
		this.path = path;
		this.name = name;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFolder() {
		return folder;
	}

	public void setFolder(long folder) {
		this.folder = folder;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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

	public void setDescrption(String description) {
		this.description = description;
	}
	
}
