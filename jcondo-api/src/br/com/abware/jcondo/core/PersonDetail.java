package br.com.abware.jcondo.core;

import java.sql.Date;
import java.util.List;

import br.com.abware.jcondo.core.model.Kinship;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.model.Phone;

public class PersonDetail {

	private Person person;

	private Date birthday;

	private Gender gender;

	private List<Kinship> kinships;

	private List<Phone> phones;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Kinship> getKinships() {
		return kinships;
	}

	public void setKinships(List<Kinship> kinships) {
		this.kinships = kinships;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

}
