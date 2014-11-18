package br.com.abware.jcondo.exception;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import org.apache.log4j.Logger;

import br.com.abware.jcondo.exception.ApplicationException;
import br.com.abware.jcondo.exception.BusinessException;
import br.com.abware.jcondo.exception.SystemException;

public class ExceptionHandler {

	private static final Logger LOGGER = Logger.getLogger(ExceptionHandler.class);

	@AroundInvoke
	public void handleException(InvocationContext ctx) {
		try {
			LOGGER.trace("ExceptionHandler in");
			ctx.proceed();
			LOGGER.trace("ExceptionHandler out");
		} catch (BusinessException e) {
			LOGGER.info(e.getMessage(), e);
			addMessage(FacesMessage.SEVERITY_WARN, e.getLocalizedMessage(), null);
		} catch (ApplicationException e) {
			LOGGER.warn(e.getMessage(), e);
			addMessage(FacesMessage.SEVERITY_WARN, e.getLocalizedMessage(), null);
		} catch (SystemException e) {
			LOGGER.fatal(e.getMessage(), e);
			addMessage(FacesMessage.SEVERITY_ERROR, e.getLocalizedMessage(), null);
		} catch (RuntimeException e) {
			LOGGER.fatal(e.getMessage(), e);
			addMessage(FacesMessage.SEVERITY_FATAL, "register.runtime.failure", null);
		} catch (Exception e) {
			LOGGER.fatal(e.getMessage(), e);
			addMessage(FacesMessage.SEVERITY_FATAL, "register.runtime.failure", null);
		}
	}
	
	private void addMessage(Severity severity, String message, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, message, detail));
	}

}
