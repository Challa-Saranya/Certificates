package com.cg.ums.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ums.bean.Placements;
import com.cg.ums.dao.PlacementRepository;

@Service
public class PlacementsServiceImpl implements PlacementsService{

	@Autowired
	PlacementRepository placementrepository;
	@Override
	public Placements savePlacementData(Placements placements) {
		return placementrepository.save(placements);
	}

	@Override
	public List<Placements> getPlacementDetails() {
		return placementrepository.findAll();
	}

	@Override
	public Placements updatePlacement(Placements placements) {
		return placementrepository.save(placements);
	}

	@Override
	public Placements searchByCompanyId(Integer companyId) {
		return placementrepository.findById(companyId).get();
	}

	@Override
	public void deletePlacement(Integer companyId) {
		placementrepository.deleteById(companyId);
	}

	@Override
	@Transactional
	public void truncateCompanyData() {
	placementrepository.truncateCompanyData();
		
	}
	

}
