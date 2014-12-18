package br.com.abware.jcondo.booking.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.abware.jcondo.booking.model.Room;
import br.com.abware.jcondo.core.persistence.ModelManager;
import br.com.abware.jcondo.exception.PersistenceException;

@Local
public interface RoomManager extends ModelManager<Room> {

	public List<Room> findRooms(boolean available) throws PersistenceException;

}
