package br.com.abware.jcondo.booking.service;

import java.util.Date;
import java.util.List;

import br.com.abware.jcondo.booking.model.Room;
import br.com.abware.jcondo.booking.model.RoomBooking;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.service.BaseService;
import br.com.abware.jcondo.exception.ApplicationException;

public interface RoomBookingService extends BaseService<RoomBooking> {

	public boolean exists(Room resource, Date date) throws ApplicationException;

	public List<RoomBooking> getBookings(Date fromDate, Date toDate) throws ApplicationException;
	
	public List<RoomBooking> getBookings(int month, int year) throws ApplicationException;

	public List<RoomBooking> getBookings(Person person) throws ApplicationException;

	public List<RoomBooking> getBookings(Room room) throws ApplicationException;

	public List<RoomBooking> getBookings() throws ApplicationException;
	
	public RoomBooking book(Person person, Room room, Date date) throws ApplicationException;
	
	public void cancel(RoomBooking booking) throws ApplicationException;
	
	public void discharge(RoomBooking booking) throws ApplicationException;

}
