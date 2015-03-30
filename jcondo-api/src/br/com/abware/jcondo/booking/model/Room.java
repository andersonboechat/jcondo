package br.com.abware.jcondo.booking.model;

import java.util.List;

import br.com.abware.jcondo.booking.model.Bookable;
import br.com.abware.jcondo.core.model.Archive;
import br.com.abware.jcondo.core.model.BaseModel;

public class Room implements Bookable, BaseModel {

	private long id;
	
	private long folderId;

	private String name;
	
	private String description;
	
	private double price;
	
	private Archive agreement;
	
	private boolean available;
	
	private List<Archive> images;
	
	@Override
	public boolean equals(Object obj) {
		return obj != null && (super.equals(obj) || (obj instanceof Room && ((Room) obj).getName().equals(name)));
	}
	
	@Override
	public int hashCode() {
        long hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + folderId;
        hash = 31 * hash + (null == name ? 0 : name.hashCode());
        return (int) hash;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFolderId() {
		return folderId;
	}

	public void setFolderId(long imageFolderId) {
		this.folderId = imageFolderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Archive getAgreement() {
		return agreement;
	}

	public void setAgreement(Archive agreement) {
		this.agreement = agreement;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public List<Archive> getImages() {
		return images;
	}

	public void setImages(List<Archive> images) {
		this.images = images;
	}

}
