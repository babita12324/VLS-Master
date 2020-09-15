package com.cjc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.BranchMaster;
import com.cjc.model.TypeMaster;

@Repository
public interface BranchRepository extends CrudRepository<BranchMaster, Integer>{
	
	public List<BranchMaster> findByBranchStatus(String status);

}
