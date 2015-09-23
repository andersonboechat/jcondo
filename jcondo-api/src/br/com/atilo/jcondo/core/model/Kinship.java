package br.com.atilo.jcondo.core.model;

import br.com.atilo.jcondo.core.model.type.KinType;

public interface Kinship extends Model {

	public Person getPerson();

	public void setPerson(Person person);

	public Person getRelative();

	public void setRelative(Person relative);

	public KinType getType();

	public void setType(KinType type);

}
