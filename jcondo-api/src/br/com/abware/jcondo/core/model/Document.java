package br.com.abware.jcondo.core.model;

public class Document extends Archive {

	private long id;
	
	private long folder;
	
	private String path;
	
	private String name;
	
	private String description;
	
	public Document() {
	}

	public Document(long id, long folder, String path, String name, String description) {
		super();
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
