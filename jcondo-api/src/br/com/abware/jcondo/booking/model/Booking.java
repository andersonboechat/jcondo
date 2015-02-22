package br.com.abware.jcondo.booking.model;

import java.util.Date;

import br.com.abware.jcondo.core.model.BaseModel;
import br.com.abware.jcondo.core.model.Flat;
import br.com.abware.jcondo.core.model.Person;

public class Booking<Resource extends Bookable> implements BaseModel {

	private long id;
	
	private Person person;
	
	private Flat flat;

	private Resource resource;

	private Date dateIn;
	
	private Date dateOut;

	private double price;

	private BookingStatus status;
	
	public Booking(Person person, Resource resource, Date dateIn, Date dateOut) {
		this.person = person;
		this.resource = resource;
		this.dateIn = dateIn;
		this.dateOut = dateOut;
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

	public Flat getFlat() {
		return flat;
	}

	public void setFlat(Flat flat) {
		this.flat = flat;
	}

	public Resource getResource() {
		return resource;
	}

	public void setRoom(Resource resource) {
		this.resource = resource;
	}

	public Date getDateIn() {
		return dateIn;
	}

	public void setDateIn(Date date) {
		this.dateIn = date;
	}

	public Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
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
