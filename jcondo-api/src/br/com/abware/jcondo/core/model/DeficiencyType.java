package br.com.abware.jcondo.core.model;

public enum DeficiencyType implements BaseModel {

	VIEWING("deficiency.type.viewing", "deficiency.type.viewing.desc"),
	HEARING("deficiency.type.hearing", "deficiency.type.hearing.desc"),
	WALKING("deficiency.type.walking", "deficiency.type.walking.desc"),
	SPEAKING("deficiency.type.walking", "deficiency.type.walking.desc"),
	MENTAL("deficiency.type.mental", "deficiency.type.mental.desc"),
	OTHER("deficiency.type.other", "deficiency.type.other.desc");

	private String label;

	private String description;

	private DeficiencyType(String label, String description) {
		this.label = label;
		this.description = description;
	}

	@Override
	public long getId() {
		return this.ordinal();
	}

	public String getLabel() {
		return label;
	}

	public String getDescription() {
		return description;
	}

}
