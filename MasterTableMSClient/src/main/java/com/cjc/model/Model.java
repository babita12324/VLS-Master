package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int modelId;
	private String modelName;
	private String status;
	
	
	@ManyToOne
	private Make mk;
	
	
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public Make getMk() {
		return mk;
	}
	public void setMk(Make mk) {
		this.mk = mk;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	

}
