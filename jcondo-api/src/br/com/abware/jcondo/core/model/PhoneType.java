package br.com.abware.jcondo.core.model;

public enum PhoneType {

	HOME("phone.type.home"),
	WORK("phone.type.work"),
	MOBILE("phone.type.mobile");

	private String label;

	private PhoneType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
