package br.com.abware.jcondo.crm.model;

public enum OccurrenceType {

	COMPLAINT("occurrence.type.complain"),
	SUGGESTION("occurrence.type.suggestion");
	
	private String label;
	
	private OccurrenceType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
