package br.com.abware.jcondo.persistence.util;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;

import br.com.abware.jcondo.persistence.entity.Room;

public class BeanUtils extends org.apache.commons.beanutils.BeanUtils {

	static {
		 ConvertUtilsBean cub = BeanUtilsBean.getInstance().getConvertUtils();
		 BeanConverter converter = new BeanConverter();
		 cub.register(converter, Room.class);
		 cub.register(converter, br.com.abware.jcondo.booking.model.Room.class);
	}
	
	public static void copyProperties(Object dest, Object orig) throws IllegalAccessException, InvocationTargetException {
		BeanUtilsBean.getInstance().copyProperties(dest, orig);
	}
}
