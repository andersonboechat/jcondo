package br.com.abware.jcondo.core.model;

import java.util.List;

public class Member extends Person {

	private Flat home;
	
	private List<Flat> flats;
	
	public Flat getHome() {
		return home;
	}

	public void setHome(Flat home) {
		this.home = home;
	}

	public List<Flat> getFlats() {
		return flats;
	}

	public void setFlats(List<Flat> flats) {
		this.flats = flats;
	}

}
