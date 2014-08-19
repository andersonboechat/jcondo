package br.com.abware.jcondo.booking.model;

import java.util.Date;

import br.com.abware.jcondo.core.model.Person;

public class RoomBooking extends Booking<Room> {

	public RoomBooking() {
		super();
	}

	public RoomBooking(Person person, Room resource, Date date) {
		super(person, resource, date);
	}

}
