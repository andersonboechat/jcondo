package br.com.atilo.jcondo.core.model;

import br.com.atilo.jcondo.core.model.type.ArchiveType;

public interface Archive extends Model {

	public long getFolderId();

	public void setFolderId(long folderId);

	public String getName();

	public void setName(String name);

	public String getDescription();

	public void setDescription(String description);

	public ArchiveType getType();

	public void setType(ArchiveType type);

	public String getPath();

	public void setPath(String path);

}
