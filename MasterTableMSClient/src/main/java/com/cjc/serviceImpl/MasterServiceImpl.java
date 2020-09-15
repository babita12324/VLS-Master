package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.model.BranchMaster;
import com.cjc.model.CityMaster;
import com.cjc.model.CountryMastr;
import com.cjc.model.Make;
import com.cjc.model.Model;
import com.cjc.model.PoliceStation;
import com.cjc.model.StateMastr;
import com.cjc.model.TypeMaster;
import com.cjc.model.UserMaster;
import com.cjc.model.VehicleMaster;
import com.cjc.repository.BranchRepository;
import com.cjc.repository.CityRepository;
import com.cjc.repository.CountryRepository;
import com.cjc.repository.HomeRepository;
import com.cjc.repository.MakeRepo;
import com.cjc.repository.MasterRepository;
import com.cjc.repository.ModelRepo;
import com.cjc.repository.StateRepository;
import com.cjc.repository.UserRepositary;
import com.cjc.repository.VehicleRepo;
import com.cjc.service.MasterService;



@Service
public class MasterServiceImpl implements MasterService {
  @Autowired
  MasterRepository rl;
  @Autowired
  BranchRepository br;
  @Autowired
  CountryRepository cr;
  @Autowired
  StateRepository sr;
  @Autowired
  CityRepository cityr;
  @Autowired
  HomeRepository hr;
  @Autowired
  VehicleRepo vh;
  @Autowired
  MakeRepo mr;
  @Autowired
  ModelRepo md;
  @Autowired
  UserRepositary ur;
  
	@Override
	public void SaveData(TypeMaster t) {
		rl.save(t);
		
		
	}
	@Override
	public void SaveBData(BranchMaster b) {
		
		br.save(b);
	}
	@Override
	public List<TypeMaster> findByStatus(int status) {
           
        List<TypeMaster> list=rl.findByStatus(status);
		return list;
	}
	@Override
	public void deleteBysrNo(int id) {
		rl.deleteBysrNo(id);
		
	}
	@Override
	public List<BranchMaster> findByBranchStatus(String status) {
		List<BranchMaster> list=br.findByBranchStatus(status);
		return list;
	}
	@Override
	public void SaveCountry(CountryMastr c) {
		
		cr.save(c);
	}
	
	@Override
	public List<CountryMastr> findBycountryStatus(String status) {
	List<CountryMastr> list=cr.findBycountryStatus(status);
		return list;
	}
	@Override
	public void saveState(StateMastr state) {
		sr.save(state);
		
	}
	@Override
	public List<StateMastr> findBystateStatus(String status) {
	List<StateMastr> list=sr.findBystateStatus(status);
		return list;
	}
	@Override
	public List<StateMastr> findBycountry_country_idAndstateStatus(int cid,String status){
		List<StateMastr> list=sr.findBycountry_countryIdAndStateStatus(cid,status);
		return list;
	}
	@Override
	public void SaveCity(CityMaster c) {
		System.out.println("Data Saved");
		cityr.save(c);
		
	}
	@Override
	public List<CityMaster> getCity(String status) {
		List<CityMaster> list=cityr.findBycityStatus(status);
		return list;
	}
	
	@Override
	public void savedata(PoliceStation s) {
		hr.save(s);

	}

	@Override
	public void deleterecord(int policestationId) {
		hr.deleteById(policestationId);

	}

	@Override
	public List<PoliceStation> getAll() {
		List<PoliceStation> list = (List<PoliceStation>) hr.findAll();
		return list;
	}

	@Override
	public PoliceStation getPoliceStation(int id) {
		PoliceStation station = hr.findById(id).get();
		return station;
	}
	@Override
	public void SaveMakeData(Make m) {
		mr.save(m);
		
	}
	@Override
	public void SaveVehicleData(VehicleMaster v) {
	  vh.save(v);
		
	}
	@Override
	public void SaveModelData(Model model) {
		md.save(model);
		
	}
	@Override
	public List<VehicleMaster> GetVehicleByStatus(String status) {
		List<VehicleMaster> list=vh.findBystatus(status);
		return list;
	}
	@Override
	public List<Make> GetMakeByStatus(String status) {
		List<Make> list=mr.findBystatus(status);
		return list;
	}
	@Override
	public List<Model> GetModelByStatus(String status) {
		List<Model> list= md.findBystatus(status);
		return list;
	}
	@Override
	public List<Make> GetMakeByVehicleId(int vid, String status) {
		List<Make> list=mr.findByvm_vehicleIdAndStatus(vid, status);
		return list;
	}
	
	@Override
	public void inserRole(UserMaster role) {
		ur.save(role);

	}

	@Override
	public List<UserMaster> getAllData() {
		List<UserMaster> list = (List<UserMaster>) ur.findAll();
		return list;
	}

	@Override
	public void DeleteUser(int id) {
		ur.deleteById(id);
	}

	@Override
	public UserMaster editUser(int id) {
		UserMaster user = ur.findById(id).get();
		return user;
	}

	@Override
	public void update(UserMaster user) {
		ur.save(user);		
	}



}
