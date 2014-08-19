package br.com.abware.jcondo.persistence.manager;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.abware.jcondo.booking.model.Room;
import br.com.abware.jcondo.booking.model.RoomBooking;
import br.com.abware.jcondo.booking.persistence.RoomBookingManager;
import br.com.abware.jcondo.exception.PersistenceException;
import br.com.abware.jcondo.persistence.entity.Booking;
import br.com.abware.jcondo.persistence.entity.BookingPK;

@Stateless
public class RoomBookingManagerImpl extends BaseManager<Booking, RoomBooking> implements RoomBookingManager {

	@SuppressWarnings("unchecked")
	public List<RoomBooking> findActiveBookingsByPeriod(Date startDate, Date endDate) throws PersistenceException {
		String queryString = "FROM Booking WHERE status <> '2' AND date BETWEEN :startDate AND :endDate";

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
	protected Class<Booking> getEntityClass() {
		return Booking.class;
	}

	@Override
	protected Class<RoomBooking> getModelClass() {
		return RoomBooking.class;
	}

	@Override
	public RoomBooking findBooking(Room room, Date date) throws PersistenceException {
		return findById(new BookingPK(room.getId(), date));
	}
	
}
