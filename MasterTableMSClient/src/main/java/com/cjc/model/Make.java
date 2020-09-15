package com.cjc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Make {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int makeId;
	private String makeName;
	private String status;
	
	
	@ManyToOne
	private VehicleMaster vm;
	
	@JsonBackReference
	@OneToMany(mappedBy = "mk")
	private List<Model> mod;

	public int getMakeId() {
		return makeId;
	}

	public void setMakeId(int makeId) {
		this.makeId = makeId;
	}

	public String getMakeName() {
		return makeName;
	}

	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}

	public VehicleMaster getVm() {
		return vm;
	}

	public void setVm(VehicleMaster vm) {
		this.vm = vm;
	}

	public List<Model> getMod() {
		return mod;
	}

	public void setMod(List<Model> mod) {
		this.mod = mod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
