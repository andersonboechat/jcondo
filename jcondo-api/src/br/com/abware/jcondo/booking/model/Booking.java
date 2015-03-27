package br.com.abware.jcondo.booking.model;

import java.util.Date;

import br.com.abware.jcondo.core.model.BaseModel;
import br.com.abware.jcondo.core.model.Domain;
import br.com.abware.jcondo.core.model.Person;

public abstract class Booking<Resource extends Bookable> implements BaseModel {

	private long id;

	private Person person;

	private Domain domain;

	private Date beginDate;

	private Date endDate;

	private double price;

	private BookingStatus status;

	public Booking(Person person, Domain domain, Date beginDate, Date endDate) {
		this.person = person;
		this.domain = domain;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}

	public abstract Resource getResource();

	public abstract void setResource(Resource resource);

	public Booking() {
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BookingStatus getStatus() {
		return status;
	}

	public void setStatus(BookingStatus status) {
		this.status = status;
	}

}
