package br.com.abware.jcondo.crm.model;

import java.util.Date;

import br.com.abware.jcondo.core.model.BaseModel;
import br.com.abware.jcondo.core.model.Person;

public class Answer implements BaseModel {

	private long id;

	private Date date;

	private String text;

	private Person person;
	
	public Answer() {
	}
	
	public Answer(Person person) {
		this();
		this.person = person;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || (obj instanceof Answer && ((Answer) obj).getId() == id));
	}
	
	@Override
	public int hashCode() {
        long hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + (null == date ? 0 : date.hashCode());
        hash = 31 * hash + (null == person ? 0 : person.hashCode());
        return (int) hash;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{id: ").append(id).append(", date:").append(date).append(", person:").append(person).append("}");
		return sb.toString();
	}	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
