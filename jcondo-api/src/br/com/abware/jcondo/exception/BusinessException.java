package br.com.abware.jcondo.exception;

public class BusinessException extends ApplicationException {

	private static final long serialVersionUID = 1L;

	public BusinessException(Throwable throwable, String message, Object ... args) {
		super(throwable, message, args);
	}
	
}
