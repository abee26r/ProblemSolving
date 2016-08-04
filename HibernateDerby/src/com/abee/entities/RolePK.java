package com.abee.entities;

import javax.persistence.Column;

public class RolePK {

	@Column(name="ROLE_NM")
	private String roleNm;
	@Column(name="ROLE_APP")
	private String roleApp;
	
	public RolePK(String roleNm, String roleApp) {
		this.roleApp = roleApp;
		this.roleNm = roleNm;
	}
	
}
