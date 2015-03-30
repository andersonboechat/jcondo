package br.com.abware.jcondo.booking.model;

import java.util.Date;

import br.com.abware.jcondo.core.model.BaseModel;
import br.com.abware.jcondo.core.model.Domain;
import br.com.abware.jcondo.core.model.Person;

public abstract class Booking<Resource extends Bookable> implements BaseModel {

	private long id;
	
	private Resource resource;

	private Person person;

	private Domain domain;

	private Date beginDate;

	private Date endDate;

	private double price;

	private BookingStatus status;

	public Booking(Person person, Domain domain, Resource resource, Date beginDate, Date endDate) {
		this.person = person;
		this.domain = domain;
		this.resource = resource;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}

	public Booking() {
	}

	@Override
	@SuppressWarnings("rawtypes")
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || 
								(obj instanceof Booking && ((Booking) obj).getResource().equals(resource) &&
								 ((Booking) obj).getPerson().equals(person) && ((Booking) obj).getDomain().equals(domain) &&
								 ((Booking) obj).getBeginDate().equals(beginDate) && ((Booking) obj).getEndDate().equals(endDate)
								));
	}	
	
	@Override
	public int hashCode() {
        long hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + (null == resource ? 0 : resource.hashCode());
        hash = 31 * hash + (null == person ? 0 : person.hashCode());
        hash = 31 * hash + (null == domain ? 0 : domain.hashCode());
        return (int) hash;
	}	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
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
