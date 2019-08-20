package com.cg.ums.service;

import java.util.List;

import com.cg.ums.bean.Canteen;


public interface CanteenService {
	Canteen saveCanteenData(Canteen canteen);

	List<Canteen> getCanteenDetails();

	Canteen updateCanteen(Canteen canteen);

	Canteen searchByCanteenId(Integer id);

	void deleteCanteenItem(Integer id);
	void truncateCanteen();


}
