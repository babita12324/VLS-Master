package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.VehicleDealer;
import com.cjc.service.VehicleService;



@CrossOrigin("*")
@RestController
@RequestMapping("/dealerController")
public class DelaerController {

	@Autowired
	VehicleService sr;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveData(@RequestBody VehicleDealer dealer) {
       System.out.println(dealer.getDealer_Name());
		sr.savaDealer(dealer);
		return "saved";

	}

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public List<VehicleDealer> getAllData() {
		List<VehicleDealer> all = sr.getAll();
		return all;

	}

	@RequestMapping(value = "/del/{dealer_id}", method = RequestMethod.DELETE)
	public List<VehicleDealer> deleteData(@PathVariable int dealer_id) {
		sr.delete(dealer_id);
		List<VehicleDealer> all = sr.getAll();
		return all;

	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void UpdateDealer(@RequestBody VehicleDealer dealer) {
//		VehicleDealer getdealer = sr.update(dealer.getDealer_id());
//
//		getdealer.setDealer_Name(dealer.getDealer_Name());
//		getdealer.setDealer_Addrees(dealer.getDealer_Addrees());
//		getdealer.setDealer_contact(dealer.getDealer_contact());
//		getdealer.setDealer_emailId(dealer.getDealer_emailId());
//		getdealer.setDealer_GST(dealer.getDealer_GST());
//
//		getdealer.setSubDealer(dealer.getSubDealer());
//


		sr.savaDealer(dealer);
		//return getdealer;

	}
	
	
	@RequestMapping(value ="/get/{dealer_id}",method = RequestMethod.GET)
	public VehicleDealer getDealerByid(@PathVariable int dealer_id)
	{
		VehicleDealer deal=sr.update(dealer_id);
		return deal;
	}

}
