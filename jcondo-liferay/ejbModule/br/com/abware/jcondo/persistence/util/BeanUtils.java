package br.com.abware.jcondo.persistence.util;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;

import com.liferay.portal.model.Organization;

import br.com.abware.jcondo.core.model.Flat;

public class BeanUtils extends org.apache.commons.beanutils.BeanUtils {

	static {
		 ConvertUtilsBean cub = BeanUtilsBean.getInstance().getConvertUtils();
		 BeanConverter converter = new BeanConverter();
		 cub.register(converter, Organization.class);
		 cub.register(converter, Flat.class);
	}
	
	public static void copyProperties(Object dest, Object orig) throws IllegalAccessException, InvocationTargetException {
		BeanUtilsBean.getInstance().copyProperties(dest, orig);
	}
}
