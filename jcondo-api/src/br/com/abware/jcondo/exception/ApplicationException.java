package br.com.abware.jcondo.exception;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class ApplicationException extends Exception {

	private static final long serialVersionUID = 1L;

	private ResourceBundle rb = ResourceBundle.getBundle("Language");

	protected Object[] args;

	public ApplicationException(String message) {
		this(message, "");
	}

	public ApplicationException(String message, Object ... args) {
		super(message);
		this.args = args;
	}
	
	@Override
	public String getLocalizedMessage() {
		return MessageFormat.format(rb.getString(getMessage()), ((Object) args));
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}

}
