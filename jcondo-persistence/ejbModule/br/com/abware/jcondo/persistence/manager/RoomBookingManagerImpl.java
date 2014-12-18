package br.com.abware.jcondo.persistence.manager;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.abware.jcondo.booking.model.BookingStatus;
import br.com.abware.jcondo.booking.model.Room;
import br.com.abware.jcondo.booking.model.RoomBooking;
import br.com.abware.jcondo.booking.persistence.RoomBookingManager;
import br.com.abware.jcondo.core.persistence.PersonManager;
import br.com.abware.jcondo.exception.PersistenceException;
import br.com.abware.jcondo.persistence.entity.Booking;
import br.com.abware.jcondo.persistence.entity.BookingPK;

@Stateless
public class RoomBookingManagerImpl extends BaseManager<Booking, RoomBooking> implements RoomBookingManager {

	@EJB
	private PersonManager personManager;
	
	@SuppressWarnings("unchecked")
	public List<RoomBooking> findBookingsByPeriod(Date startDate, Date endDate) throws PersistenceException {
		String queryString = "FROM Booking WHERE date BETWEEN :startDate AND :endDate";

		Query query = em.createQuery(queryString);
		query.setParameter("startDate", startDate);
		query.setParameter("endDate", endDate);

		List<Booking> bookings = query.getResultList();

		return getModels(bookings);
	}

	@SuppressWarnings("unchecked")
	public List<RoomBooking> findBookingsByPersonId(long personId) throws PersistenceException {
		String queryString = "FROM Booking WHERE userId = :userId ORDER BY date desc";

		Query query = em.createQuery(queryString);
		query.setParameter("userId", personId);

		List<Booking> bookings = query.getResultList();

		return getModels(bookings);
	}
	
	@Override
	public RoomBooking getModel(Booking booking) throws PersistenceException {
		RoomBooking rb = super.getModel(booking);
		rb.setPerson(personManager.findById(booking.getId()));
		return rb;
	}
	
	@Override
	protected Class<Booking> getEntityClass() {
		return Booking.class;
	}

	@Override
	protected Class<RoomBooking> getModelClass() {
		return RoomBooking.class;
	}

	@Override
	public RoomBooking findBooking(Room room, Date beginDate, Date endDate, BookingStatus status) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
