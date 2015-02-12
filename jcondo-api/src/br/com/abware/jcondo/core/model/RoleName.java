package br.com.abware.jcondo.core.model;

public enum RoleName {

	USER_ENROLLER("User Enroller"),
	VEHIACLE_ENROLLER("Vehicle Enroller"),
	ACCESS_LOGGER("Access Logger"),
	SITE_ADMIN("Site Administrator"),
	SITE_MEMBER("Site Member"),
	SUPPLIER_ADMIN("Supplier Administrator"),
	FLAT_ADMIN("Flat Administrator"),
	EMPLOYEE("Employee"),
	GUEST("Guest"),
	VISITOR("Visitor"),
	LESSEE("Room Lessee"),
	DEBATER("Forum Debater"),
	HABITANT("Condominium Habitant");
	
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
