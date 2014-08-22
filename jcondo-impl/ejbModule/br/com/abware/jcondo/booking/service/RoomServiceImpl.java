package br.com.abware.jcondo.booking.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.com.abware.jcondo.booking.model.Room;
import br.com.abware.jcondo.booking.persistence.RoomManager;
import br.com.abware.jcondo.core.persistence.PersonManager;
import br.com.abware.jcondo.exception.ApplicationException;
import br.com.abware.jcondo.exception.PersistenceException;

@Stateless(name="roomService")
@Local(RoomService.class)
public class RoomServiceImpl implements RoomService {

	@EJB
	private RoomManager roomManager;

	@EJB
	private PersonManager personManager;
	
	@Override
	public Room create(Room room) throws ApplicationException {
		return roomManager.save(room);
	}

	@Override
	public void delete(Room room) {
	}

	@Override
	public List<Room> getRooms() throws PersistenceException {
		return roomManager.findAll();
	}

}
