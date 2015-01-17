package br.com.abware.jcondo.core.model;

public class Manager<D extends Domain> extends Employee<D> {

	public Manager(D domain) {
		super(domain);
	}

}
