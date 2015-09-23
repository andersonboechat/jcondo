package br.com.abware.jcondo.core.model;

import java.util.List;

public class Flat extends Domain {

	private Person person;
	
	private int block;

	private int number;
	
	private Boolean disables;

	private Boolean pets;	

	private List<PetType> petTypes;
	
	private Boolean brigade;

	public Flat() {
		// TODO Auto-generated constructor stub
	}

	public Flat(long id, int block, int number) {
		this();
		this.id = id;
		this.block = block;
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || (obj instanceof Flat && block == ((Flat) obj).getBlock() && number == ((Flat) obj).getNumber()));
	}

	@Override
	public int hashCode() {
        long hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + block;
        hash = 31 * hash + number;
        return (int) hash;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{id: ").append(id).append(", block:").append(block).append(", number:").append(number).append("}");
		return sb.toString();
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Boolean getDisables() {
		return disables;
	}

	public void setDisables(Boolean disables) {
		this.disables = disables;
	}

	public Boolean getPets() {
		return pets;
	}

	public void setPets(Boolean pets) {
		this.pets = pets;
	}

	public List<PetType> getPetTypes() {
		return petTypes;
	}

	public void setPetTypes(List<PetType> petTypes) {
		this.petTypes = petTypes;
	}

	public Boolean getBrigade() {
		return brigade;
	}

	public void setBrigade(Boolean brigade) {
		this.brigade = brigade;
	}

}
