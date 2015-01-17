package br.com.abware.jcondo.core.model;

import br.com.abware.jcondo.exception.BusinessException;

public class Visitor<D extends Domain> extends Role<D> {

	public Visitor(D domain) throws BusinessException {
		if (!domain.getClass().equals(Condominium.class) || 
				!domain.getClass().equals(Flat.class)) {
			throw new BusinessException("");
		}
		this.domain = domain;
	}

}
