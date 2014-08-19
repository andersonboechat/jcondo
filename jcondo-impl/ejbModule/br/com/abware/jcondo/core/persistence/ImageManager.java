package br.com.abware.jcondo.core.persistence;

import java.util.List;

import br.com.abware.jcondo.booking.model.Room;
import br.com.abware.jcondo.core.model.Image;
import br.com.abware.jcondo.exception.PersistenceException;

public interface ImageManager extends ModelManager<Image> {

	public List<Image> findImages(Room room) throws PersistenceException;

}
