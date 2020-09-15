package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.exception.CountryIdNotFound;
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
import com.cjc.repository.MakeRepo;
import com.cjc.repository.ModelRepo;
import com.cjc.repository.VehicleRepo;
import com.cjc.service.MasterService;


@CrossOrigin("http://localhost:4200")
@RestController
public class MasterController {
	@Autowired
	MasterService ms;
	
	
	@RequestMapping(value = "/getAllStatesByCountryid/{id}", method = RequestMethod.GET)
	public ResponseEntity getAllStatesByCountryId(@PathVariable("id") int cid) 
	{
		String status="Active";
		List<StateMastr> list =ms.findBycountry_country_idAndstateStatus(cid, status);
		System.out.println("List"+list);
		if (list.isEmpty()) {
			throw new CountryIdNotFound("Id not found");
		}else {
		return new ResponseEntity(list, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value = "/editUser/{id}", method = RequestMethod.GET)
	public ResponseEntity editUser(@PathVariable("id") int id) {
		UserMaster user = ms.editUser(id);
		if (user!=null) {

			return new ResponseEntity(user, HttpStatus.OK);
		} else {
			System.out.println("null object");
			/* throw new CountryIdNotFound("User not found with this id"); */
			return new ResponseEntity(user, HttpStatus.OK);
		}
		
	}
	
	
	@RequestMapping(value = "/saveData",method = RequestMethod.POST)
	public String saveData(@RequestBody TypeMaster t) 
	{
		System.out.println("Status Type"+t.getStatusName());
		ms.SaveData(t);
		return "Data Saved";
		
	}
	
	@RequestMapping(value = "/saveCountry",method = RequestMethod.POST)
	public String saveCountry(@RequestBody CountryMastr c) 
	{
		System.out.println("Status Type"+c.getCountryName());
		ms.SaveCountry(c);
		return "Data Saved";
		
	}
	
	
	
	@RequestMapping(value = "/saveState",method = RequestMethod.POST)
	public String saveState(@RequestBody StateMastr state) 
	{
		System.out.println("Status Type"+state.getStateName());
		System.out.println("Country"+state.getCountry().getCountryId());
		ms.saveState(state);
		return "Data Saved";
		
	}
	
	@RequestMapping(value = "/saveCity",method = RequestMethod.POST)
	public String saveCity(@RequestBody CityMaster city) 
	{
		System.out.println("Status Type"+city.getCityName());
		System.out.println("Status"+city.getCityStatus());
		System.out.println("Country"+city.getState().getCountry().getCountryName());
		ms.SaveCity(city);
		return "Data Saved";
		
	}
	
	@RequestMapping(value = "/saveDataBranch",method = RequestMethod.POST)
	public String saveBData(@RequestBody BranchMaster b) 
	{
		System.out.println("Branch"+b.getBranchName());
		ms.SaveBData(b);
		return "Data Saved";
		
	}
	
	@RequestMapping(value = "/getAllDataMaster", method = RequestMethod.GET)
	public List<TypeMaster> getAllData() 
	{
		int status=0;
		List<TypeMaster> list =ms.findByStatus(status);
		System.out.println("List"+list);
		return list;
		
	}
	

	@RequestMapping(value = "/getAllCountry", method = RequestMethod.GET)
	public List<CountryMastr> getAllCountry() 
	{
		String status="Active";
		List<CountryMastr> list =ms.findBycountryStatus(status);
		System.out.println("List"+list);
		return list;
		
	}
	

	@RequestMapping(value = "/getAllStates", method = RequestMethod.GET)
	public List<StateMastr> getAllStates() 
	{
		String status="Active";
		List<StateMastr> list =ms.findBystateStatus(status);
		System.out.println("List"+list);
		return list;
		
	}
	
	@RequestMapping(value = "/getAllCity", method = RequestMethod.GET)
	public List<CityMaster> getAllCities() 
	{
		String status="Active";
		List<CityMaster> list =ms.getCity(status);
		System.out.println("List"+list);
		return list;
		
	}
	
	
	
	@RequestMapping(value = "/getAllStatesByCountry/{id}", method = RequestMethod.GET)
	public List<StateMastr> getAllStatesByCountry(@PathVariable("id") int cid) 
	{
		String status="Active";
		List<StateMastr> list =ms.findBycountry_country_idAndstateStatus(cid, status);
		System.out.println("List"+list);
		return list;
		
	}
	
	@RequestMapping(value = "/getAllDataBranchMaster", method = RequestMethod.GET)
	public List<BranchMaster> getAllBranchData() 
	{
		String status="Active";
		List<BranchMaster> list =ms.findByBranchStatus(status);
		System.out.println("List"+list);
		return list;
		
	}
	

	@RequestMapping(value = "/savepolice", method = RequestMethod.POST)
	public String savedata(@RequestBody PoliceStation s) {
		System.out.println("Record Insert Successfully");
		ms.savedata(s);
		return "Inserted Successfully";

	}

	@RequestMapping(value = "/delette/{policestationId}", method = RequestMethod.DELETE)
	public String deletedata(@PathVariable("policestationId") int policestationId) {
		ms.deleterecord(policestationId);
		return "Record Deleted Successfully";
	}

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public List<PoliceStation> getAllPoliceSData() {
		List<PoliceStation> all = ms.getAll();
		return all;
	}

	@RequestMapping(value = "/updatepolice", method = RequestMethod.PUT)
	public String updatedata(@RequestBody PoliceStation s) {
		ms.savedata(s);
		return "Record Updated Successfully";
	}
	
	@GetMapping("/editt/{id}")
	public PoliceStation editStation(@PathVariable("id") int id) {
		PoliceStation station = ms.getPoliceStation(id);
		return station;
	}
	

	@PostMapping("vehicleyReg")
	public String regV(@RequestBody VehicleMaster v) {
		
		ms.SaveVehicleData(v);
		return "Vehicle Registered";
	}
	
	@PostMapping("modelReg")
	public String regM(@RequestBody Model ml) {
		System.out.println(ml);
		ms.SaveModelData(ml);
		return "Model Registered";
	}
	
	@PostMapping("makeReg")
	public String regMk(@RequestBody Make me) {
		
		ms.SaveMakeData(me);
		return "Make Registered";
	}
	
	
	
	
	@RequestMapping(value = "/getAllVehicle", method = RequestMethod.GET)
	public List<VehicleMaster> getAllVehicle() 
	{
		String status="Active";
		List<VehicleMaster> list =ms.GetVehicleByStatus(status);
		System.out.println("List"+list);
		return list;
		
	}
	
	@RequestMapping(value = "/getAllMake", method = RequestMethod.GET)
	public List<Make> getAllMake() 
	{
		String status="Active";
		List<Make> list =ms.GetMakeByStatus(status);
		System.out.println("List"+list);
		return list;
		
	}
	
	
	@RequestMapping(value = "/getAllModel", method = RequestMethod.GET)
	public List<Model> getAllModel() 
	{
		String status="Active";
		List<Model> list =ms.GetModelByStatus(status);
		System.out.println("List"+list);
		return list;
		
	}
	

	@RequestMapping(value = "/saveModel",method = RequestMethod.POST)
	public String saveModel(@RequestBody Model model) 
	{
		System.out.println("Status Type"+model.getModelName());
		System.out.println("Status"+model.getMk().getMakeName());
		System.out.println("Country"+model.getMk().getVm().getVehicleName());
		ms.SaveModelData(model);
		return "Data Saved";
		
	}
	
	@RequestMapping(value = "/getAllMakeByVehicle/{id}", method = RequestMethod.GET)
	public List<Make> getAllMakeByVehicle(@PathVariable("id") int vid) 
	{
		String status="Active";
		List<Make> list =ms.GetMakeByVehicleId(vid, status);
		System.out.println("List"+list);
		return list;
		
	}
	
	
	
	
	@PostMapping("/save")
	public String saveUser(@RequestBody UserMaster vlsUser) {
		System.out.println(vlsUser.getAddress());
		ms.inserRole(vlsUser);
		return "Inserted Successfully";
	}

	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public List<UserMaster> findAllUser() {
		List<UserMaster> list = ms.getAllData();
		return list;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteData(@PathVariable("id") int id) {
		ms.DeleteUser(id);
		return "Delete Successfully";
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public UserMaster edit(@PathVariable("id") int id) {
		UserMaster user = ms.editUser(id);
		return user;
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updateData(@RequestBody UserMaster user) {
		ms.update(user);
		return "Update Successully";
	}
	 
	
	
	
	
		
	
	

}
