package com.cg.ums.service;

import java.util.List;

import com.cg.ums.bean.Register;




public interface RegisterService {
	public Register addUser(Register user);
	public List<Register> getUser();
	public boolean validateUser(String email, String password);

}