package br.com.abware.jcondo.exception;

public enum ExceptionMessage {

	/* Booking Exception Messages */
	CANCEL_DEADLINE_EXCEEDED("bkg.cancel.deadline.exceeded"),
	ROOM_NOT_AVAILABLE("bkg.room.not.available"),
	ROOM_NOT_FOUND("bkg.room.not.found"),
	ROOM_ALREADY_BOOKED("bkg.room.already.booked"),
	PAST_DATE("bkg.past.date"),
	INVALID_DATE_RANGE("bkg.invalid.date.range"),
	INVALID_PERIOD("bkg.invalid.period"),

	/* Occurrence Exception Messages */
	OCCURRENCE_ALREADY_DONE("");
	
	
	/* Core Business Exception Messages */

	/* Persistence Exception Messages */
	
	
	private String key;
	
	private ExceptionMessage(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
	
}
