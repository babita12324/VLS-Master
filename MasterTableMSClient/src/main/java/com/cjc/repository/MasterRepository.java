package com.cjc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.TypeMaster;

@Repository
public interface MasterRepository extends CrudRepository<TypeMaster, Integer> {
	
	public List<TypeMaster> findByStatus(int status);
	public void deleteBysrNo(int id);

}
