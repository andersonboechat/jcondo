package br.com.abware.jcondo.persistence.manager;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portlet.documentlibrary.NoSuchFolderException;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;

import br.com.abware.jcondo.booking.model.Room;
import br.com.abware.jcondo.core.model.Image;
import br.com.abware.jcondo.core.persistence.ImageManager;
import br.com.abware.jcondo.exception.PersistenceException;

@Stateless
public class ImageManagerImpl extends AbstractManager<DLFileEntry, Image> implements ImageManager {

	@Override
	public Image save(Image model, long personId) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image findById(Object id) throws PersistenceException {
		return getModel(getEntity(new Image((Long) id, null, null, null)));
	}

	@Override
	public List<Image> findAll() throws PersistenceException {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Image> findImages(Room room) throws PersistenceException {
		List<Image> images = new ArrayList<Image>();

		try {
			DLFolder folder = DLFolderLocalServiceUtil.getFolder(room.getImageFolderId());
			List<FileEntry> fileEntries = DLAppLocalServiceUtil.getFileEntries(folder.getRepositoryId(), folder.getFolderId());
	
			for (FileEntry fe : fileEntries) {
				images.add(getModel((DLFileEntry) fe.getModel()));
			}
		} catch (NoSuchFolderException e) { 
			//TODO log it!
		} catch (Exception e) {
			throw new PersistenceException("", e);
		}

		return images;
	}

	protected Image getModel(DLFileEntry fe) throws PersistenceException {
		try {
			return new Image(fe.getFileEntryId(), fe.getTitle(), fe.getDescription(), fe.getFolder().getPath() + fe.getTitle());
		} catch (Exception e) {
			throw new PersistenceException("", e);
		}
	}

	@Override
	protected Class<Image> getModelClass() {
		return Image.class;
	}

	@Override
	protected DLFileEntry getEntity(Image image) throws PersistenceException {
		try {
			return (DLFileEntry) DLAppLocalServiceUtil.getFileEntry(image.getId()).getModel();
		} catch (Exception e) {
			throw new PersistenceException("", e);
		}
	}

}
