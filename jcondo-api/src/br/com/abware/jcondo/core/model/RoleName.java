package br.com.abware.jcondo.core.model;

public enum RoleName {

	ADMIN_MANAGER("Administration Manager"),
	ADMIN_ASSISTANT("Administration Assistant"),
	ADMIN_MEMBER("Administration Member"),

	SUPPLIER_MANAGER("Supplier Manager"),

	FLAT_MANAGER("Flat Manager"),
	FLAT_ASSISTANT("Flat Assistant"),
	FLAT_MEMBER("Flat Member"),

	SITE_ADMIN("Site Administrator"),
	SITE_MEMBER("Site Member"),

	SENIOR_USER("Senior User"),
	REGULAR_USER("Regular User"),
	JUNIOR_USER("Junior User"),

	GUEST("Guest"),
	VISITOR("Visitor");
	
	private String label;

	private RoleName(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public static RoleName parse(String label) {
		for (RoleName roleName : values()) {
			if (roleName.getLabel().equalsIgnoreCase(label)) {
				return roleName;
			}
		}

		return null;
	}
}
