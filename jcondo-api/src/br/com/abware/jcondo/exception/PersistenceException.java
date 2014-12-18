package br.com.abware.jcondo.exception;

public class PersistenceException extends ApplicationException {

	private static final long serialVersionUID = 1L;
	
	public PersistenceException(String message) {
		this(null, message);
	}
	
	public PersistenceException(Throwable throwable, String message, Object ... args) {
		super(throwable, message, args);
	}

}
