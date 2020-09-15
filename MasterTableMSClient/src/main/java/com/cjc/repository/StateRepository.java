package com.cjc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.StateMastr;
@Repository
public interface StateRepository extends CrudRepository<StateMastr, Integer> {
	
	public List<StateMastr> findBystateStatus(String status); 
	public List<StateMastr> findBycountry_countryIdAndStateStatus(int cid,String status);

}
