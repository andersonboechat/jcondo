package br.com.abware.jcondo.booking.model;

import br.com.abware.jcondo.core.model.Document;

public interface Bookable {

	public double getPrice();

	public boolean isAvailable();

	public Document getAgreement();

}
