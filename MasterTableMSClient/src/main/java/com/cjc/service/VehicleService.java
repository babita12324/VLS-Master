package com.cjc.service;

import java.util.List;

import javax.persistence.Entity;

import com.cjc.model.VehicleDealer;

public interface VehicleService {
	
	public void savaDealer(VehicleDealer dealer);
	
	public List<VehicleDealer> getAll();
	
	public void delete(int dealer_id);
	
	public VehicleDealer update(int dealer_id);
	


}
