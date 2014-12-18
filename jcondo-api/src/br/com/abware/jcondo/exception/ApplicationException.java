package br.com.abware.jcondo.exception;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class ApplicationException extends Exception {

	private static final long serialVersionUID = 1L;

	private ResourceBundle rb = ResourceBundle.getBundle("AppException");

	protected Object[] args;

	public ApplicationException(Throwable throwable, String message, Object ... args) {
		super(message, throwable);
		this.args = args;
	}

	@Override
	public String getLocalizedMessage() {
		return MessageFormat.format(rb.getString(getMessage()), ((Object) args));
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object ... args) {
		this.args = args;
	}

}
