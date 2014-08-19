package br.com.abware.jcondo.booking.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.com.abware.jcondo.booking.model.BookingStatus;
import br.com.abware.jcondo.booking.model.Room;
import br.com.abware.jcondo.booking.model.RoomBooking;
import br.com.abware.jcondo.booking.persistence.RoomBookingManager;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.persistence.PersonManager;
import br.com.abware.jcondo.exception.ApplicationException;

@Stateless(name="roomBookingService")
@Local(RoomBookingService.class)
public class RoomBookingServiceImpl implements RoomBookingService {
	
	@EJB
	private RoomBookingManager roomBookingManager;

	@EJB
	private PersonManager personManager;

	@Override
	public boolean exists(Room room, Date date) {
		try {
			return roomBookingManager.findBooking(room, date) != null;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<RoomBooking> getBookings(Person person) throws ApplicationException {
		return roomBookingManager.findBookingsByPersonId(person.getId());
	}

	@Override
	public List<RoomBooking> getBookings(Room room) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomBooking> getBookings() throws ApplicationException {
		return roomBookingManager.findAll();
	}

	@Override
	public RoomBooking book(Person person, Room room, Date date) throws ApplicationException {
		return roomBookingManager.save(new RoomBooking(person, room, date), personManager.getLoggedPerson().getId());
	}

	@Override
	public void cancel(RoomBooking booking) throws ApplicationException {
		booking.setStatus(BookingStatus.CANCELLED);
		roomBookingManager.save(booking, personManager.getLoggedPerson().getId());
	}

	@Override
	public void discharge(RoomBooking booking) throws ApplicationException {
		booking.setStatus(BookingStatus.PAID);
		roomBookingManager.save(booking, personManager.getLoggedPerson().getId());
	}

	@Override
	public List<RoomBooking> getBookings(int month, int year) throws ApplicationException {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		Date fromDate = calendar.getTime();
		
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date toDate = calendar.getTime();

		return getBookings(fromDate, toDate);
	}

	@Override
	public List<RoomBooking> getBookings(Date fromDate, Date toDate) throws ApplicationException {
		return roomBookingManager.findActiveBookingsByPeriod(fromDate, toDate);
	}

}
