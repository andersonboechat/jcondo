package br.com.abware.jcondo.core.model;

public class Employee<D extends Domain> extends Role<D> {
	
	public Employee(D domain) {
		this.domain = domain;
	}

}
