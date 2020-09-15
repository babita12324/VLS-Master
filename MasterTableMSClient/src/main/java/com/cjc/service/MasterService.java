package com.cjc.service;

import java.util.List;


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


public interface MasterService {
	
	void SaveData(TypeMaster t);
	void SaveBData(BranchMaster b);
	void SaveCountry(CountryMastr c);
	List<CountryMastr> findBycountryStatus(String status);
	List<TypeMaster> findByStatus(int status);
	void deleteBysrNo(int id);
	List<BranchMaster> findByBranchStatus(String status);
	void saveState(StateMastr state);
	List<StateMastr> findBystateStatus(String status);
	List<StateMastr> findBycountry_country_idAndstateStatus(int cid,String status);
	void SaveCity(CityMaster c);
	List<CityMaster> getCity(String status);
    void savedata(PoliceStation s);
    void deleterecord(int policestationId );
    List<PoliceStation> getAll();
	public PoliceStation getPoliceStation( int id);
	void SaveMakeData(Make m);
	List<Make> GetMakeByStatus(String status);
	List<Make> GetMakeByVehicleId(int vid, String status);
	void SaveVehicleData(VehicleMaster v);
	List<VehicleMaster> GetVehicleByStatus(String status);
	void SaveModelData(Model model);
	List<Model> GetModelByStatus(String status);
	public void inserRole(UserMaster role);

	public List<UserMaster> getAllData();

	public void DeleteUser(int id);

	public UserMaster editUser(int id);

	public void update(UserMaster user);
	
	
	

}
