package com.cg.ums.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.ums.bean.Placements;

@Repository
public interface PlacementRepository extends JpaRepository<Placements, Integer> {


	@Modifying
	@Query(value ="truncate table placements",nativeQuery=true)
	void truncateCompanyData();
}
