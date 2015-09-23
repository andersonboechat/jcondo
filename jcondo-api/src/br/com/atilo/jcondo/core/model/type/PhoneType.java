package br.com.atilo.jcondo.core.model.type;

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
