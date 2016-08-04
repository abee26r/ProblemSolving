package com.abee.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="ROLE")
@IdClass(value= RolePK.class)
public class Role {
	
	@Id
	@Column(name="ROLE_APP")
	private int roleApp;
	
	@Column(name="ROLE_NM")
	private String roleNm;
	
	@Column(name="ACCESS_DET")
	private String accessDet;
	
	@Column(name="COMMENTS")
	private String comments;

	public int getRoleApp() {
		return roleApp;
	}

	public void setRoleApp(int roleApp) {
		this.roleApp = roleApp;
	}

	public String getRoleNm() {
		return roleNm;
	}

	public void setRoleNm(String roleNm) {
		this.roleNm = roleNm;
	}

	public String getAccessDet() {
		return accessDet;
	}

	public void setAccessDet(String accessDet) {
		this.accessDet = accessDet;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
}
