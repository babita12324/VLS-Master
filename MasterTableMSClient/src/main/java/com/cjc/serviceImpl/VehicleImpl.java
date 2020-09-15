package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.VehicleDealer;
import com.cjc.repository.VehicleRepository;
import com.cjc.service.VehicleService;


@Service
public class VehicleImpl implements VehicleService{

	@Autowired
	VehicleRepository repo;
	
	
	@Override
	public void savaDealer(VehicleDealer dealer) {
		// TODO Auto-generated method stub
		
		repo.save(dealer);
	
	}


	@Override
	public List<VehicleDealer> getAll() {
		// TODO Auto-generated method stub
		List all=(List) repo.findAll();
		return all;
	}


	@Override
	public void delete(int dealer_id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(dealer_id);
		
	}


	@Override
	public VehicleDealer update(int dealer_id) {
		// TODO Auto-generated method stub
		
		VehicleDealer dealerone=repo.findById(dealer_id).get();
		return dealerone;
	}

}
