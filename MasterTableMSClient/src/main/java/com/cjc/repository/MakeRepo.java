package com.cjc.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Make;
import com.cjc.model.StateMastr;

public interface MakeRepo extends JpaRepository<Make,  Integer> {
	
	public List<Make> findBystatus(String status);
	public List<Make> findByvm_vehicleIdAndStatus(int vid,String status);

}
