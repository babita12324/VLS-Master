package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BranchMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int branchId;
	private String branchName;
	private String branchIfscCode;
	private String branchContNo;
	private String branchEmailId;
	private String branchAddress;
	private String branchCity;
	private String branchCountry;
	private String branchState;
	private String branchStatus;
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchIfscCode() {
		return branchIfscCode;
	}
	public void setBranchIfscCode(String branchIfscCode) {
		this.branchIfscCode = branchIfscCode;
	}
	public String getBranchContNo() {
		return branchContNo;
	}
	public void setBranchContNo(String branchContNo) {
		this.branchContNo = branchContNo;
	}
	public String getBranchEmailId() {
		return branchEmailId;
	}
	public void setBranchEmailId(String branchEmailId) {
		this.branchEmailId = branchEmailId;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	public String getBranchCity() {
		return branchCity;
	}
	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}
	
	public String getBranchCountry() {
		return branchCountry;
	}
	public void setBranchCountry(String branchCountry) {
		this.branchCountry = branchCountry;
	}
	public String getBranchState() {
		return branchState;
	}
	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}
	public String getBranchStatus() {
		return branchStatus;
	}
	public void setBranchStatus(String branchStatus) {
		this.branchStatus = branchStatus;
	}
	
	
	
	

}
