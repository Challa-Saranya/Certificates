package com.cg.ums.service;

import java.util.List;

import com.cg.ums.bean.College;



public interface CollegeService {

	College saveCollegeData(College college);

	List<College> getCollegeDetails();

	College updatecollege(College college);
	


	College searchbycollegeid(Integer collegeid);

	void deletecollege(Integer cid);

	void delete();
	

}
