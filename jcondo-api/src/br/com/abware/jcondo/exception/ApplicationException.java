package br.com.abware.jcondo.exception;

public class ApplicationException extends Exception {

	private static final long serialVersionUID = 1L;

	protected Object[] args;

	public ApplicationException(Throwable throwable, String message, Object ... args) {
		super(message, throwable);
		this.args = args;
	}

	public ApplicationException(String message, Object ... args) {
		this(null, message, args);
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object ... args) {
		this.args = args;
	}

}
