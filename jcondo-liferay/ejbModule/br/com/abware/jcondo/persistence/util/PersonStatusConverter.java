package br.com.abware.jcondo.persistence.util;

import org.apache.commons.beanutils.Converter;

import com.liferay.portal.kernel.workflow.WorkflowConstants;

import br.com.abware.jcondo.core.PersonStatus;

public class PersonStatusConverter implements Converter {

	@SuppressWarnings("rawtypes")
	@Override
	public Object convert(Class clazz, Object orig) {
		Object dest = null;

		try {
			dest = clazz.newInstance();
			if (dest instanceof PersonStatus && orig instanceof Integer) {
				Integer status = (Integer) orig;
				if (status == WorkflowConstants.STATUS_APPROVED) {
					dest = PersonStatus.ATIVO;
				} else if (status == WorkflowConstants.STATUS_DENIED) {
					dest = PersonStatus.ATIVO;
				} else {
					
				}
			} else if (dest instanceof Integer && orig instanceof PersonStatus) {
				PersonStatus status = (PersonStatus) orig;
				if (PersonStatus.ATIVO.equals(status)) {
					dest = WorkflowConstants.STATUS_APPROVED;
				} else {
					dest = WorkflowConstants.STATUS_DENIED;
				}
			} else {
				throw new IllegalArgumentException();
			}

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return clazz;
	}

}
