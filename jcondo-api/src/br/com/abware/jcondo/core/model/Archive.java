package br.com.abware.jcondo.core.model;

public class Archive implements BaseModel {
	
	private long id;
	
	private long folderId;

	private ArchiveType type;

	private String path;
	
	private String name;
	
	private String description;
	
	public Archive() {
	}

	public Archive(long id, long folderId, ArchiveType type, String path, String name, String description) {
		super();
		this.id = id;
		this.folderId = folderId;
		this.type = type;
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

	public long getFolderId() {
		return folderId;
	}

	public void setFolderId(long folderId) {
		this.folderId = folderId;
	}

	public ArchiveType getType() {
		return type;
	}

	public void setType(ArchiveType type) {
		this.type = type;
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

	public void setDescription(String description) {
		this.description = description;
	}

}
