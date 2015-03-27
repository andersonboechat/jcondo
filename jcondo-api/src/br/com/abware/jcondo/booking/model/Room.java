package br.com.abware.jcondo.booking.model;

import java.util.List;

import br.com.abware.jcondo.booking.model.Bookable;
import br.com.abware.jcondo.core.model.BaseModel;
import br.com.abware.jcondo.core.model.Document;
import br.com.abware.jcondo.core.model.Image;

public class Room implements Bookable, BaseModel {

	private long id;
	
	private long folderId;

	private String name;
	
	private String description;
	
	private double price;
	
	private Document agreement;
	
	private boolean available;
	
	private List<Image> images;

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

	public Document getAgreement() {
		return agreement;
	}

	public void setAgreement(Document agreement) {
		this.agreement = agreement;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

}
