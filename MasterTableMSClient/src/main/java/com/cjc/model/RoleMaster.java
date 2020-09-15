package com.cjc.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RoleMaster {
	@Id
	private int roleid;
	private String roledesignation;
	private String rolestatus;
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public String getRoledesignation() {
		return roledesignation;
	}
	public void setRoledesignation(String roledesignation) {
		this.roledesignation = roledesignation;
	}
	public String getRolestatus() {
		return rolestatus;
	}
	public void setRolestatus(String rolestatus) {
		this.rolestatus = rolestatus;
	}

	
	
}