package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Model;
import com.cjc.model.VehicleMaster;


public interface ModelRepo extends JpaRepository<Model,  Integer> {
	
	public List<Model> findBystatus(String status);

}
