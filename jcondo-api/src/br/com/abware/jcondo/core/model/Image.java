package br.com.abware.jcondo.core.model;

public class Image extends Archive {

	private long folder;
	
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

	public long getFolder() {
		return folder;
	}

	public void setFolder(long folder) {
		this.folder = folder;
	}

}
