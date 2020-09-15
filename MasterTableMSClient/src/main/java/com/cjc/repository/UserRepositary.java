package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cjc.model.UserMaster;

@Repository
public interface UserRepositary extends CrudRepository<UserMaster, Integer> {

}
