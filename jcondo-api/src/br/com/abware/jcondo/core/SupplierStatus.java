package br.com.abware.jcondo.core;

public enum SupplierStatus {

	ENABLED("enabled"),
	DISABLED("disabled"),
	
	OVERDUE("overdue"),
	COMPLIANT("compliant");
	
	private String key;
	
	private SupplierStatus(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
