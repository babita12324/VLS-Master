package com.cjc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class VehicleDealer {

	@Id
	private int dealer_id;
	private int city_id;
	private String dealer_Name;
	private String dealer_Addrees;
	private String dealer_contact;
	private String dealer_emailId;
	private String dealer_GST;
	
	@OneToOne(cascade = CascadeType.ALL)
	private VehicleSubDealer subDealer;

	public int getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(int dealer_id) {
		this.dealer_id = dealer_id;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getDealer_Name() {
		return dealer_Name;
	}

	public void setDealer_Name(String dealer_Name) {
		this.dealer_Name = dealer_Name;
	}

	public String getDealer_Addrees() {
		return dealer_Addrees;
	}

	public void setDealer_Addrees(String dealer_Addrees) {
		this.dealer_Addrees = dealer_Addrees;
	}

	public String getDealer_contact() {
		return dealer_contact;
	}

	public void setDealer_contact(String dealer_contact) {
		this.dealer_contact = dealer_contact;
	}

	public String getDealer_emailId() {
		return dealer_emailId;
	}

	public void setDealer_emailId(String dealer_emailId) {
		this.dealer_emailId = dealer_emailId;
	}

	public String getDealer_GST() {
		return dealer_GST;
	}

	public void setDealer_GST(String dealer_GST) {
		this.dealer_GST = dealer_GST;
	}

	public VehicleSubDealer getSubDealer() {
		return subDealer;
	}

	public void setSubDealer(VehicleSubDealer subDealer) {
		this.subDealer = subDealer;
	}

		

}
