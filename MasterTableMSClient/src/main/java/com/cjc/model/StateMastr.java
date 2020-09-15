package com.cjc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class StateMastr {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stateId;
	private String stateName;
	private String stateStatus;
	@ManyToOne
	private CountryMastr country;
	
	@JsonBackReference
	@OneToMany(mappedBy = "state")
	Set<CityMaster> setCity=new HashSet<CityMaster>();

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateStatus() {
		return stateStatus;
	}

	public void setStateStatus(String stateStatus) {
		this.stateStatus = stateStatus;
	}

	public CountryMastr getCountry() {
		return country;
	}

	public void setCountry(CountryMastr country) {
		this.country = country;
	}

	public Set<CityMaster> getSetCity() {
		return setCity;
	}

	public void setSetCity(Set<CityMaster> setCity) {
		this.setCity = setCity;
	}
	
	
	
	
}
