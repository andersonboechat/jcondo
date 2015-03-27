package br.com.abware.jcondo.booking.model;

import java.util.Date;

import br.com.abware.jcondo.core.model.Domain;
import br.com.abware.jcondo.core.model.Person;

public class RoomBooking extends Booking<Room> {

	private Room resource;

	public RoomBooking() {
		super();
	}

	public RoomBooking(Person person, Domain domain, Room room, Date beginDate, Date endDate) {
		super(person, domain, beginDate, endDate);
		this.resource = room;
	}

	@Override
	public Room getResource() {
		return resource;
	}

	@Override
	public void setResource(Room resource) {
		this.resource = resource;
	}

}
