package br.com.abware.jcondo.booking.model;

import java.util.Date;

import br.com.abware.jcondo.core.model.BaseModel;
import br.com.abware.jcondo.core.model.Person;

public class Booking<Resource extends Bookable> implements BaseModel {

	private long id;
	
	private Person person;

	private Resource resource;

	private Date date;

	private double price;

	private BookingStatus status;
	
	public Booking(Person person, Resource resource, Date date) {
		this.person = person;
		this.resource = resource;
		this.date = date;
	}

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

	public Resource getResource() {
		return resource;
	}

	public void setRoom(Resource resource) {
		this.resource = resource;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
