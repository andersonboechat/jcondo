package br.com.abware.jcondo.core.model;

import br.com.abware.jcondo.exception.BusinessException;

public class Councillor extends Employee<Condominium> {

	public Councillor(Condominium condominium) throws BusinessException {
		super(condominium);
	}

}
