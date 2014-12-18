package br.com.abware.jcondo.booking.exception;

import br.com.abware.jcondo.exception.BusinessException;
import br.com.abware.jcondo.exception.ExceptionMessage;

public class BookingException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public BookingException(ExceptionMessage message, Object ... args) {
		this(null, message, args);
	}
	
	public BookingException(Throwable throwable, ExceptionMessage message, Object ... args) {
		super(throwable, message.getKey(), args);
	}
}
