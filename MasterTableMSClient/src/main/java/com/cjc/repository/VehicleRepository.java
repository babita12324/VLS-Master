package com.cjc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.VehicleDealer;

@Repository
public interface VehicleRepository extends CrudRepository<VehicleDealer, Integer>{

}
