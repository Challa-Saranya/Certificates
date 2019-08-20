package com.cg.ums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.ums.bean.Register;
import com.cg.ums.dao.RegisterDao;

@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	RegisterDao registerdao;

	@Override
	public Register addUser(Register user) {
		// TODO Auto-generated method stub

		return registerdao.save(user);
	}

	@Override
	public List<Register> getUser() {
		// TODO Auto-generated method stub
		return registerdao.findAll();
	}

	@Override
	public boolean validateUser(String email, String password) {
		// TODO Auto-generated method stub
		List<Register> register=registerdao.findAll();
		for(Register r:register) {
			if(r.getEmail().equals(email)&&(r.getPassword().equals(password))) {
				return true;
			}
		}
		return false;
	}
	
	

}
