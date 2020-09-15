package com.cjc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.CountryMastr;
@Repository
public interface CountryRepository extends CrudRepository<CountryMastr, Integer>{
	
	public List<CountryMastr> findBycountryStatus(String status);

}
