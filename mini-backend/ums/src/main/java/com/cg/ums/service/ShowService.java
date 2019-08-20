package com.cg.ums.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ums.dao.CollegeRepository;


@Service
public class ShowService {

	@Autowired
	CollegeRepository repo;
	
	@Transactional
	public List<String> showtables() {
		
		return repo.displayTables();
	}
	
	@Transactional
	public List< String> showfields(String tablename) {
		System.out.println("service");
		List<String> fields=repo.displayTables1(tablename);
		System.out.println(fields);
		return fields;
	}

	
}
