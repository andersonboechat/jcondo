package br.com.abware.jcondo.core.model;

public class Role implements BaseModel {

	protected long id;

	protected RoleName name;

	protected String title;

	public Role() {
		// TODO Auto-generated constructor stub
	}
	
	public Role(long id, RoleName name, String title) {
		this();
		this.id = id;
		this.name = name;
		this.title = title;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || id == ((Role) obj).getId() || name == ((Role) obj).getName());
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public RoleName getName() {
		return name;
	}

	public void setName(RoleName name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
