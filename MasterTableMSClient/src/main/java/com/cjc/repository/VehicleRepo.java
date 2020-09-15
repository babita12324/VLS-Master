package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.VehicleMaster;


public interface VehicleRepo extends JpaRepository<VehicleMaster, Integer> {
	
	public List<VehicleMaster> findBystatus(String status);

}
