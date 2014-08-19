package br.com.abware.jcondo.crm.model;

import java.util.Date;

import br.com.abware.jcondo.core.model.Person;

public interface Answer {

	public long getId();
	
	public Date getDate();

	public String getText();	

	public Person getPerson();

}
