package br.com.abware.jcondo.booking.service;

import java.util.List;

import br.com.abware.jcondo.booking.model.Room;
import br.com.abware.jcondo.core.service.BaseService;
import br.com.abware.jcondo.exception.ApplicationException;
import br.com.abware.jcondo.exception.PersistenceException;

public interface RoomService extends BaseService<Room> {
	
	public List<Room> getRooms() throws PersistenceException;

	public Room create(Room room) throws ApplicationException;

	public void delete(Room room);

}
