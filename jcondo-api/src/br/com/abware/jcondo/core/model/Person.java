package br.com.abware.jcondo.core.model;

import java.util.Date;
import java.util.List;

import br.com.abware.jcondo.core.Gender;
import br.com.abware.jcondo.core.PersonStatus;

public class Person implements BaseModel {

	private long id;
	
	private long userId;

	private String fullName;
	
	private String firstName;

	private String lastName;

	private String emailAddress;

	private String identity;
	
	private Gender gender;

	private Image picture;

	private PersonStatus status;

	private Date birthday;
	
	private List<Membership> memberships;

	public Person() {
		this.gender = Gender.MALE;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || (obj instanceof Person && ((Person) obj).getIdentity().equals(identity)));
	}
	
	@Override
	public int hashCode() {
        long hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + (null == identity ? 0 : identity.hashCode());
        return (int) hash;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{id: ").append(id).append(", userId:").append(userId)
		  .append(", firstName:").append(firstName).append(", lastName:").append(lastName)
		  .append(", email:").append(emailAddress).append(", identity:").append(identity)
		  .append(", status:").append(status).append(", memberships:").append(memberships).append("}");
		return sb.toString();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Image getPicture() {
		return picture;
	}

	public void setPicture(Image picture) {
		this.picture = picture;
	}

	public PersonStatus getStatus() {
		return status;
	}

	public void setStatus(PersonStatus status) {
		this.status = status;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public List<Membership> getMemberships() {
		return memberships;
	}

	public void setMemberships(List<Membership> memberships) {
		this.memberships = memberships;
	}

}
