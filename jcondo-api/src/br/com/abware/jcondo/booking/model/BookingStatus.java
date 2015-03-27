package br.com.abware.jcondo.booking.model;

public enum BookingStatus {

	BOOKED("booking.status.booked"),
	PAID("booking.status.paid"),
	CANCELLED("booking.status.cancelled"),
	DELETED("booking.status.deleted");

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
