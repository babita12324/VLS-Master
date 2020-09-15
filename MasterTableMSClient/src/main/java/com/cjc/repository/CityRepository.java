package com.cjc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cjc.model.CityMaster;

public interface CityRepository extends CrudRepository<CityMaster, Integer > {
	
	List<CityMaster> findBycityStatus(String status);

}
