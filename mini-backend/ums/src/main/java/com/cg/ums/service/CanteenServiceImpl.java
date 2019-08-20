package com.cg.ums.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ums.bean.Canteen;
import com.cg.ums.dao.CanteenRepository;

@Service
public class CanteenServiceImpl implements CanteenService {
	@Autowired
	CanteenRepository canteenRepository;

	@Override
	public Canteen saveCanteenData(Canteen canteen) {
		
		return canteenRepository.save(canteen);
	}

	@Override
	public List<Canteen> getCanteenDetails() {
		
		return canteenRepository.findAll();
	}

	@Override
	public Canteen updateCanteen(Canteen canteen) {
		
		return canteenRepository.save(canteen);
	}

	@Override
	public Canteen searchByCanteenId(Integer id) {
		
		return canteenRepository.findById(id).get();
	}

	@Override
	public void deleteCanteenItem(Integer id) {
		
		canteenRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void truncateCanteen() {
	canteenRepository.truncateCanteen();
		
	}
	
	

}
