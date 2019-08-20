package com.cg.ums.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ums.bean.College;

import com.cg.ums.service.CollegeService;

@RestController
@RequestMapping("/college")
@CrossOrigin(origins="http://localhost:4200")
public class CollegeController {
	@Autowired
	private CollegeService  collegeService;
	@RequestMapping(value ="/savecollege", method = RequestMethod.POST)
	public College saveCollege(@RequestBody College college) throws IOException {
		return  collegeService.saveCollegeData(college);
	}
	@RequestMapping(value = "/getcollegedetails", method = RequestMethod.GET)
	public List<College> getAllColleges() {
		System.out.println("in controller");
		return  collegeService.getCollegeDetails();
	} 
	@RequestMapping(value = "/updatecollege", method = RequestMethod.PUT)
	public College updateCollege(@RequestBody College college) {
		return  collegeService.updatecollege(college);
	}
	
	@RequestMapping(value="/searchcollege",method=RequestMethod.GET)
	
	public College searchcollege(@RequestParam("id") Integer collegeid)
	{
		return collegeService.searchbycollegeid(collegeid);
		
	}
	@RequestMapping(value = "/deletecollege/{cid}", method = RequestMethod.DELETE)
	public void delCollege(@PathVariable("cid") Integer cid) {
		collegeService.deletecollege(cid);
	
	}
	
	@DeleteMapping(value = "/deletecollegetable")
	public void delTable() {
		collegeService.delete();

	}
	
	
	
}
