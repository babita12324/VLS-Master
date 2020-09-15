package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleSubDealer {

	@Id
	private int s_id;
	private String s_name;
	private String s_addrees;
	private String s_contact;
	private String s_emailId;
	private String s_GST;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_addrees() {
		return s_addrees;
	}
	public void setS_addrees(String s_addrees) {
		this.s_addrees = s_addrees;
	}
	public String getS_contact() {
		return s_contact;
	}
	public void setS_contact(String s_contact) {
		this.s_contact = s_contact;
	}
	public String getS_emailId() {
		return s_emailId;
	}
	public void setS_emailId(String s_emailId) {
		this.s_emailId = s_emailId;
	}
	public String getS_GST() {
		return s_GST;
	}
	public void setS_GST(String s_GST) {
		this.s_GST = s_GST;
	}
	
	

}
