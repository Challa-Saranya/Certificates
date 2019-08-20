package com.cg.ums.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ums.bean.Canteen;
import com.cg.ums.service.CanteenService;

@RestController
@RequestMapping("/canteen")
@CrossOrigin(origins="http://localhost:4200")
public class CanteenController {
	@Autowired
	CanteenService service;
	@PostMapping(value ="/savecanteen")
	public Canteen SaveItems(@RequestBody Canteen canteen ) {
		return  service.saveCanteenData(canteen);
	}
	@GetMapping(value = "/getcanteendetails")
	public List<Canteen> getAllItems() {
		return service.getCanteenDetails();
	} 
	@PutMapping(value = "/updatecanteen")
	public Canteen updateCanteenDetails(@RequestBody Canteen canteen) {
		return service.updateCanteen(canteen);
	}
	
	@GetMapping(value="/searchcanteen")
	
	public Canteen searchByCanteenId(@RequestParam("id") Integer id)
	{
		return service.searchByCanteenId(id);
		
	}
	@DeleteMapping(value = "/deletecanteenItem/{id}")
	public void delCanteenItem(@PathVariable("id") Integer id) {
		service.deleteCanteenItem(id);
		
	}
	@DeleteMapping(value = "/deletecanteen")
	public void delTable() {
		service.truncateCanteen();

	}
	
	
	

}
