package br.com.abware.jcondo.core.model;

import java.util.List;

public class Homeowner extends Resident {
	
	private List<Flat> flats;
	
	public Homeowner() {
		super();
	}

	public List<Flat> getFlats() {
		return flats;
	}

	public void setFlats(List<Flat> flats) {
		this.flats = flats;
	}

}
