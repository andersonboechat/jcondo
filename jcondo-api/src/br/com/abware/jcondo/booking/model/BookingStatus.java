package br.com.abware.jcondo.booking.model;

public enum BookingStatus {

	OPENED("booking.status.opened"),
	PAID("booking.status.paid"),
	CANCELLED("booking.status.cancelled");

	private String label;
	
	private BookingStatus(String label) {
		this.setLabel(label);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
