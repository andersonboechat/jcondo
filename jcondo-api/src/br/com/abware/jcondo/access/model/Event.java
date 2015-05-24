package br.com.abware.jcondo.access.model;

import java.util.Date;

import br.com.abware.jcondo.core.model.BaseModel;

public class Event implements BaseModel {
	
	protected long id;

	protected Date date;

	protected String detail;

	public Event(Date date, String comment) {
		super();
		this.date = date;
		this.detail = comment;
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

	public String getDetail() {
		return detail;
	}

	public void setComment(String comment) {
		this.detail = comment;
	}

	
	

}
