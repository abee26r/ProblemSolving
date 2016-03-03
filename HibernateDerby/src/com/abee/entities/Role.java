package com.abee.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="ROLE")
public class Role {
	
	@Id
	@Column(name="ROLE_ID")
	private int roleId;
	
	@Column(name="ROLE")
	private String role;
	
	@Column(name="DEPT")
	private String dept;
	
	@Column(name="EFF_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp effDt;
	
	@Column(name="EXP_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp expDt;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Timestamp getEffDt() {
		return effDt;
	}
	public void setEffDt(Timestamp effDt) {
		this.effDt = effDt;
	}
	public Timestamp getExpDt() {
		return expDt;
	}
	public void setExpDt(Timestamp expDt) {
		this.expDt = expDt;
	}
	
	
}
