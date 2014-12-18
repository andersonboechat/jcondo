package br.com.abware.jcondo.booking.exception;

import br.com.abware.jcondo.exception.ApplicationException;
import br.com.abware.jcondo.exception.ExceptionMessage;

public class InvalidBookingException extends ApplicationException {

	private static final long serialVersionUID = 1L;
	
	public InvalidBookingException(ExceptionMessage message, Object ... args) {
		this(null, message, args);
	}
	
	public InvalidBookingException(Throwable throwable, ExceptionMessage message, Object ... args) {
		super(throwable, message.getKey(), args);
	}


}
