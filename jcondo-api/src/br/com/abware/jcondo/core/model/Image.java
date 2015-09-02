package br.com.abware.jcondo.core.model;

public class Image extends Archive {

	private long folder;
	
	private int width;
	
	private int height;
	
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
