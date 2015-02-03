package br.com.abware.jcondo.core.model;

public enum RoleName {

	OWNER("Flat Owner", 0),
	RENTER("Flat Renter", 0),
	RESIDENT("Flat Resident", 0),
	DEPENDENT("Flat Dependent", 0),

	THIRD_PARTY("Third Party", 1),
	EMPLOYEE("Employee", 1),

	GUEST("Guest", 2),
	VISITOR("Visitor", 2),

	LESSEE("Room Lessee", 2),
	DEBATER("Forum Debater", 2),
	HABITANT("Condominium Habitant", 2);

	private String label;

	private int type;

	private RoleName(String label, int type) {
		this.label = label;
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public int getType() {
		return type;
	}

	public static RoleName parse(String name) {
		for (RoleName roleName : values()) {
			if (roleName.getLabel().equalsIgnoreCase(name)) {
				return roleName;
			}
		}

		return null;
	}
}
