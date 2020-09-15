package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.PoliceStation;





@Repository
public interface HomeRepository extends CrudRepository<PoliceStation, Integer> {
	

}
