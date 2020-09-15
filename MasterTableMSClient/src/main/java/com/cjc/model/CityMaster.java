package com.cjc.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class CityMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cityId;
	private String cityName;
	private String cityStatus;
	
	//@JsonBackReference
	@ManyToOne
	private StateMastr state;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public StateMastr getState() {
		return state;
	}

	public void setState(StateMastr state) {
		this.state = state;
	}

	public String getCityStatus() {
		return cityStatus;
	}

	public void setCityStatus(String cityStatus) {
		this.cityStatus = cityStatus;
	}
	
	
	
	

}
