package br.com.abware.jcondo.booking.persistence;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import br.com.abware.jcondo.booking.model.Room;
import br.com.abware.jcondo.booking.model.RoomBooking;
import br.com.abware.jcondo.core.persistence.ModelManager;
import br.com.abware.jcondo.exception.PersistenceException;

@Local
public interface RoomBookingManager extends ModelManager<RoomBooking> {
	
	public List<RoomBooking> findActiveBookingsByPeriod(Date startDate, Date endDate) throws PersistenceException;

	public List<RoomBooking> findBookingsByPersonId(long userId) throws PersistenceException;
	
	public RoomBooking findBooking(Room room, Date date) throws PersistenceException;

}
