package br.com.atilo.jcondo.core.model.type;

import br.com.abware.jcondo.core.model.BaseModel;

public enum PersonType implements BaseModel {

	OWNER("person.type.owner"),
	RENTER("person.type.renter"),
	RESIDENT("person.type.resident"),
	DEPENDENT("person.type.dependent"),
	GUEST("person.type.guest"),
	VISITOR("person.type.visitor"),

	EMPLOYEE("person.type.employee"),
	MANAGER("person.type.manager"),

	SYNCDIC("person.type.syndic"),
	SUB_SYNCDIC("person.type.sub-syndic"),
	ADMIN_ADVISOR("person.type.admin-advisor"),
	TAX_ADVISOR("person.type.tax-advisor"),
	ADMIN_ASSISTANT("person.type.admin-assistant"),
	GATEKEEPER("person.type.gatekeeper");

	public static PersonType[] FLAT_TYPES = {OWNER, RENTER, RESIDENT, GUEST, VISITOR, EMPLOYEE};
	
	public static PersonType[] SUPPLIER_TYPES = {MANAGER, EMPLOYEE};

	public static PersonType[] ADMIN_TYPES = {SYNCDIC, SUB_SYNCDIC, ADMIN_ASSISTANT, ADMIN_ADVISOR, TAX_ADVISOR, EMPLOYEE, VISITOR};
	
	private String label;

	private PersonType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	@Override
	public long getId() {
		return this.ordinal();
	}

}
