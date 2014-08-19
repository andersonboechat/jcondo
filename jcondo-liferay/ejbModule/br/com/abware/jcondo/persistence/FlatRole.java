package br.com.abware.jcondo.persistence;

import com.liferay.portal.model.Role;

import br.com.abware.jcondo.core.BaseRole;

public class FlatRole implements BaseRole {

	private Role role;
	
	public FlatRole(Role role) {
		this.role = role;
	}

	@Override
	public long getId() {
		return role.getRoleId();
	}

	@Override
	public String getTitle() {
		return role.getTitle();
	}

}
