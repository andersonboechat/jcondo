package br.com.abware.jcondo.booking.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;

import br.com.abware.jcondo.booking.exception.BookingException;
import br.com.abware.jcondo.booking.exception.InvalidBookingException;
import br.com.abware.jcondo.booking.model.BookingStatus;
import br.com.abware.jcondo.booking.model.Room;
import br.com.abware.jcondo.booking.model.RoomBooking;
import br.com.abware.jcondo.booking.persistence.RoomBookingManager;
import br.com.abware.jcondo.booking.persistence.RoomManager;
import br.com.abware.jcondo.core.model.Person;
import br.com.abware.jcondo.core.persistence.PersonManager;
import br.com.abware.jcondo.exception.ApplicationException;
import br.com.abware.jcondo.exception.BusinessException;
import br.com.abware.jcondo.exception.ExceptionMessage;
import br.com.abware.jcondo.exception.PersistenceException;

@Stateless(name="roomBookingService")
@Local(RoomBookingService.class)
public class RoomBookingServiceImpl implements RoomBookingService {
	
	@EJB
	private RoomManager roomManager;
	
	@EJB
	private RoomBookingManager roomBookingManager;

	@EJB
	private PersonManager personManager;

	@Override
	public boolean exists(RoomBooking booking) throws ApplicationException {
		boolean exists;
		exists = roomBookingManager.findBooking(booking.getResource(), booking.getBeginTime(), 
									  			booking.getEndTime(), BookingStatus.BOOKED) != null;
		exists = exists || roomBookingManager.findBooking(booking.getResource(), booking.getBeginTime(), 
														  booking.getEndTime(), BookingStatus.PAID) != null;
		return exists; 
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
		return roomBookingManager.findBookingsByPeriod(fromDate, toDate);
	}

	@Override
	public RoomBooking book(RoomBooking booking) throws ApplicationException {
		// Validating booking data
		Date date = new Date(); 
		if (date.after(booking.getBeginTime())) {
			String dateIn = DateFormatUtils.format(booking.getBeginTime(), RoomBookingServiceImpl.DATETIME_FORMAT);
			throw new InvalidBookingException(ExceptionMessage.PAST_DATE, dateIn);
		}

		if (booking.getEndTime().before(booking.getBeginTime())) {
			String dateIn = DateFormatUtils.format(booking.getBeginTime(), RoomBookingServiceImpl.DATETIME_FORMAT);
			String dateOut = DateFormatUtils.format(booking.getEndTime(), RoomBookingServiceImpl.DATETIME_FORMAT);
			throw new InvalidBookingException(ExceptionMessage.INVALID_DATE_RANGE, dateIn, dateOut);
		}

		Room room;
		try{ 
			room = roomManager.findById(booking.getResource().getId());
		} catch (PersistenceException e) {
			throw new InvalidBookingException(e, ExceptionMessage.ROOM_NOT_FOUND, booking.getResource().getId());
		}

		// Validating business rules
		if (!room.isAvailable()) {
			throw new BookingException(ExceptionMessage.ROOM_NOT_AVAILABLE, booking.getResource().getName());
		}

		if (exists(booking)) {
			String dateIn = DateFormatUtils.format(booking.getBeginTime(), RoomBookingServiceImpl.DATE_FORMAT);
			String hourIn = DateFormatUtils.format(booking.getBeginTime(), RoomBookingServiceImpl.TIME_FORMAT);
			String hourOut = DateFormatUtils.format(booking.getEndTime(), RoomBookingServiceImpl.TIME_FORMAT);
			throw new BookingException(ExceptionMessage.ROOM_ALREADY_BOOKED, 
									   booking.getResource().getName(), dateIn, hourIn, hourOut);
		}

		Date bkgMinHour = DateUtils.setHours(date, BKG_MIN_HOUR);
		Date bkgMaxHour = DateUtils.setHours(date, BKG_MAX_HOUR);

		if (DateUtils.truncatedCompareTo(booking.getBeginTime(), bkgMinHour, Calendar.HOUR_OF_DAY) < 0 ||
				DateUtils.truncatedCompareTo(booking.getEndTime(), bkgMaxHour, Calendar.HOUR_OF_DAY) > 0) {
			String bbp = DateFormatUtils.format(DateUtils.truncate(booking.getBeginTime(), Calendar.HOUR_OF_DAY), 
												RoomBookingServiceImpl.TIME_FORMAT);
			String bep = DateFormatUtils.format(DateUtils.truncate(booking.getEndTime(), Calendar.HOUR_OF_DAY), 
												RoomBookingServiceImpl.TIME_FORMAT);
			throw new BookingException(ExceptionMessage.INVALID_PERIOD, bbp, bep);
		}

		if (room.getId() == 3) {
			//if (DateUtils.addHours(booking.getDateIn(), 4)) {}
		}

		return roomBookingManager.save(booking);
	}

	@Override
	public void cancel(RoomBooking booking) throws ApplicationException {
		Date now = new Date();
		Date deadlineDate = DateUtils.addDays(booking.getBeginTime(), -BOOKING_CANCEL_DEADLINE);

		if (DateUtils.truncatedCompareTo(now, deadlineDate, Calendar.DAY_OF_YEAR) > 0) {
			throw new BookingException(ExceptionMessage.CANCEL_DEADLINE_EXCEEDED, BOOKING_CANCEL_DEADLINE);
		}

		booking.setStatus(BookingStatus.CANCELLED);
		roomBookingManager.save(booking);
	}

	@Override
	public void discharge(RoomBooking booking) throws ApplicationException {
		booking.setStatus(BookingStatus.PAID);
		roomBookingManager.save(booking);
	}

}
