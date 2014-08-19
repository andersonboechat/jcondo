package br.com.abware.jcondo.persistence.manager;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.abware.jcondo.booking.persistence.RoomManager;
import br.com.abware.jcondo.core.persistence.ImageManager;
import br.com.abware.jcondo.exception.PersistenceException;
import br.com.abware.jcondo.persistence.entity.Room;

@Stateless
public class RoomManagerImpl extends BaseManager<Room, br.com.abware.jcondo.booking.model.Room> implements RoomManager {

	@EJB
	private ImageManager imageManager;	

	@SuppressWarnings("unchecked")
	public List<br.com.abware.jcondo.booking.model.Room> findAvailableRooms() throws PersistenceException {
		String queryString = "FROM Room WHERE available = 1";
		Query query = em.createQuery(queryString);

		List<Room> rooms = query.getResultList();

		return getModels(rooms);
	}

	protected br.com.abware.jcondo.booking.model.Room getModel(Room room) throws PersistenceException {
		br.com.abware.jcondo.booking.model.Room aRoom = super.getModel(room);
		aRoom.setImages(imageManager.findImages(aRoom));
		return aRoom;
	}

	@Override
	protected Class<Room> getEntityClass() {
		return Room.class;
	}

	@Override
	protected Class<br.com.abware.jcondo.booking.model.Room> getModelClass() {
		return br.com.abware.jcondo.booking.model.Room.class;
	}

}
