package com.cg.ums.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ums.bean.College;


import com.cg.ums.dao.CollegeRepository;
@Service
public class CollegeServiceImpl implements CollegeService{
      @Autowired
	 CollegeRepository collgeRepository;
  

	@Override
	public College saveCollegeData(College college) {
		return collgeRepository.save(college);
		
	}

	@Override
	public List<College> getCollegeDetails() {
		System.out.println("in service");
		return collgeRepository.findAll();
		
	}

	@Override
	public College updatecollege(College college) {
		return collgeRepository.save(college);
		
	}


	@Override
	public College searchbycollegeid(Integer collegeid) {
	College id=collgeRepository.findById(collegeid).get();
	return id;
	}

	@Override
	public void deletecollege(Integer cid) {
		collgeRepository.deleteById(cid);
		
	}

	@Override
	@Transactional
	public void delete() {
		collgeRepository.truncateMyTable();
		
	}
	
	
}
