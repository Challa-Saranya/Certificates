package com.cg.ums.service;

import java.util.List;

import com.cg.ums.bean.Placements;

public interface PlacementsService {

	Placements savePlacementData(Placements placements);

	List<Placements> getPlacementDetails();

	Placements updatePlacement(Placements placements);

	Placements searchByCompanyId(Integer companyId);

	void deletePlacement(Integer companyId);
	void truncateCompanyData();
}
