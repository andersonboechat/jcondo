package br.com.abware.jcondo.booking.model;

import java.util.Date;

import br.com.abware.jcondo.core.model.Domain;
import br.com.abware.jcondo.core.model.Person;

public class RoomBooking extends Booking<Room> {

	public RoomBooking() {
		super();
	}

	public RoomBooking(Person person, Domain domain, Room room, Date beginDate, Date endDate) {
		super(person, domain, room, beginDate, endDate);
	}

}
