package br.com.abware.jcondo.booking.service;

import java.util.Date;
import java.util.List;

import br.com.abware.jcondo.booking.model.Room;
import br.com.abware.jcondo.booking.model.RoomBooking;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.service.BaseService;
import br.com.abware.jcondo.exception.ApplicationException;

public interface RoomBookingService extends BaseService<RoomBooking> {

	public static final int CANCEL_BOOKING_DEADLINE = 7;

	public static final String DATETIME_FORMAT = "dd/MM/yyyy HH:mm";

	public static final String DATE_FORMAT = "dd/MM/yyyy";

	public static final String TIME_FORMAT = "HH:mm";

	public static final int BKG_MIN_HOUR = 9;

	public static final int BKG_MAX_HOUR = 22;	

	public boolean exists(RoomBooking booking) throws ApplicationException;

	public List<RoomBooking> getBookings(Date fromDate, Date toDate) throws ApplicationException;

	public List<RoomBooking> getBookings(int month, int year) throws ApplicationException;

	public List<RoomBooking> getBookings(Person person) throws ApplicationException;

	public List<RoomBooking> getBookings(Room room) throws ApplicationException;

	public List<RoomBooking> getBookings() throws ApplicationException;

	public RoomBooking book(RoomBooking booking) throws ApplicationException;

	public void cancel(RoomBooking booking) throws ApplicationException;

	public void discharge(RoomBooking booking) throws ApplicationException;

}
