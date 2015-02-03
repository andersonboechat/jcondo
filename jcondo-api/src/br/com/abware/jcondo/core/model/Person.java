package br.com.abware.jcondo.core.model;

import java.util.Date;
import java.util.List;

import br.com.abware.jcondo.core.Gender;
import br.com.abware.jcondo.core.PersonStatus;

public class Person implements BaseModel {

	private long id;

	private String lastName;

	private String firstName;

	private String emailAddress;

	private String fullName;

	private String identity;
	
	private Date birthday;

	private Gender gender;

	private String picture;

	private PersonStatus status;

	private List<Membership> memberships;
	
	public Person() {
		this.gender = Gender.MALE;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public PersonStatus getStatus() {
		return status;
	}

	public void setStatus(PersonStatus status) {
		this.status = status;
	}

	public List<Membership> getMemberships() {
		return memberships;
	}

	public void setMemberships(List<Membership> memberships) {
		this.memberships = memberships;
	}

	public Role getRole(Domain domain) {
		for (Membership m : memberships) {
			if (m.getDomain().equals(domain)) {
				return m.getRole();
			}
		}
		return null;
	}

}
