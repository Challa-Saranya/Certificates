package com.cg.ums.controller;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ums.bean.College;
import com.cg.ums.service.CollegeService;
import com.cg.ums.service.ShowService;



@RestController
@RequestMapping("/show")
@CrossOrigin(origins="http://localhost:4200")
public class ShowController {

	@Autowired
	ShowService service;
	@Autowired
	CollegeService cservice;
	@GetMapping(value = "/selectedtable")
	
	public List<String> showtables() {
		System.out.println("hello");
		List<String> tables=service.showtables();
//		for (String string : tables) {
//			System.out.println(string);
//		}
		return tables;
	}
	
	
	@GetMapping(value = "/showcollege")
	public List<String> showcollegedata(@RequestParam("tablename") String tablename) {
		System.out.println("hello");
		System.out.println(tablename);
		List<String> tables=service.showfields(tablename);
		
	
		return tables;
	}
	
	
}
