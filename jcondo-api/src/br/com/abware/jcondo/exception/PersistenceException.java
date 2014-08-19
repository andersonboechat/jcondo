package br.com.abware.jcondo.exception;

public class PersistenceException extends ApplicationException {

	private static final long serialVersionUID = 1L;
	
	public PersistenceException(String message) {
		this(message, "");
	}
	
	public PersistenceException(String message, Object ... args) {
		super(message, args);
	}

}
