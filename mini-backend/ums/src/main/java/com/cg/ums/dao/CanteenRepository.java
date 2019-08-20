package com.cg.ums.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.ums.bean.Canteen;

@Repository

public interface CanteenRepository extends JpaRepository<Canteen, Integer>{

	@Modifying
	@Query(value ="truncate table canteen",nativeQuery=true)
	void truncateCanteen();
}
