package com.cjc.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PoliceStation {
	
	@Id
	private int policestationId;
	private String policeStationname;
	private String policestationzone;
    private String policestationAddress;
    private String city;
    private String state;
	public int getPolicestationId() {
		return policestationId;
	}
	public void setPolicestationId(int policestationId) {
		this.policestationId = policestationId;
	}
	public String getPoliceStationname() {
		return policeStationname;
	}
	public void setPoliceStationname(String policeStationname) {
		this.policeStationname = policeStationname;
	}
	public String getPolicestationzone() {
		return policestationzone;
	}
	public void setPolicestationzone(String policestationzone) {
		this.policestationzone = policestationzone;
	}
	public String getPolicestationAddress() {
		return policestationAddress;
	}
	public void setPolicestationAddress(String policestationAddress) {
		this.policestationAddress = policestationAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}