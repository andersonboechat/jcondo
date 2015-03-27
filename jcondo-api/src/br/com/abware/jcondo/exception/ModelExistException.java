package br.com.abware.jcondo.exception;

import br.com.abware.jcondo.exception.BusinessException;

public class ModelExistException extends BusinessException {

	public ModelExistException(Throwable throwable, String message, Object ... args) {
		super(throwable, message, args);
	}

	private static final long serialVersionUID = 1L;

}
