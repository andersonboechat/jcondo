package br.com.abware.jcondo.crm.model;

import java.util.Date;

import br.com.abware.jcondo.core.model.BaseModel;
import br.com.abware.jcondo.core.model.Person;

public class Occurrence implements BaseModel {

	private long id;
	
	private String code;
	
	private Date date;
	
	private String text;

	private OccurrenceType type;

	private Person person;
	
	private Answer answer;
	
	public Occurrence() {
	}

	public Occurrence(OccurrenceType type, Person person) {
		super();
		this.type = type;
		this.person = person;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || (obj instanceof Occurrence && ((Occurrence) obj).getCode().equals(code)));
	}
	
	@Override
	public int hashCode() {
        long hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + (null == code ? 0 : code.hashCode());
        return (int) hash;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{id: ").append(id).append(", code:").append(code)
		  .append(", date:").append(date).append(", type:").append(type).append("}");
		return sb.toString();
	}	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public OccurrenceType getType() {
		return type;
	}

	public void setType(OccurrenceType type) {
		this.type = type;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

}
