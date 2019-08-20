package com.cg.ums.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ums.bean.Register;
import com.cg.ums.service.RegisterService;


@RestController
@RequestMapping("/register")
@CrossOrigin(origins="http://localhost:4200")
public class RegisterController {
	@Autowired
	RegisterService registerservice;
	@GetMapping("/getall")
	public List<Register> getUser(){
		return registerservice.getUser();
		
	}
	@PostMapping("/addall")
	public Register addUser(@RequestBody Register user) {
		Register data=registerservice.addUser(user);
		return data;
		
	}
	@RequestMapping(value="/validateUser",method=RequestMethod.GET)
	public boolean validateUser(@RequestParam("email") String email,@RequestParam("password") String password) {
		return registerservice.validateUser(email, password);
	}
	
}

