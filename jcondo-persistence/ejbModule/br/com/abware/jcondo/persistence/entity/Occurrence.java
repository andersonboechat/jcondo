package br.com.abware.jcondo.persistence.entity;

import br.com.abware.jcondo.crm.model.OccurrenceType;

//import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the cb_occurrence database table.
 * 
 */
@Entity
@Table(name="cb_occurrence")
public class Occurrence extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

//	@NotEmpty
	private String text;

	@Enumerated(EnumType.ORDINAL)
	private OccurrenceType type;

	private long userId;

	@Column(name="answerId", columnDefinition="int", nullable=true)
	private Answer answer;

	public Occurrence(long userId) {
		this.userId = userId;
	}

	public Occurrence() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public OccurrenceType getType() {
		return this.type;
	}

	public void setType(OccurrenceType type) {
		this.type = type;
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Answer getAnswer() {
		return this.answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

}