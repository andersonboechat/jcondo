package br.com.atilo.jcondo.core.model;

import java.util.Date;

import java.util.List;

import br.com.atilo.jcondo.core.model.type.Gender;
import br.com.atilo.jcondo.core.model.type.PersonStatus;

public interface Person extends Model {

	public long getUserId();

	public void setUserId(long userId);

	public String getName();

	public void setName(String name);
	
	public String getSurname();

	public void setSurname(String surname);

	public String getEmail();

	public void setEmail(String email);

	public String getIdentity();

	public void setIdentity(String identity);

	public Gender getGender();

	public void setGender(Gender gender);

	public Image getImage();

	public void setImage(Image picture);

	public PersonStatus getStatus();

	public void setStatus(PersonStatus status);

	public Date getBirthday();

	public void setBirthday(Date birthday);

	public boolean getRegisterComplete();

	public void setRegisterComplete(boolean registerComplete);

	public List<Membership> getMemberships();

	public void setMemberships(List<Membership> memberships);
	
}
