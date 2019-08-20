package com.cg.ums.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.ums.bean.College;
@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {
	@Modifying
	@Query(value ="truncate table college",nativeQuery=true)
	void truncateMyTable();
	
  @Query(value = "show tables", nativeQuery = true)
		List<String> displayTables();

		@Query(value = "SELECT column_name FROM information_schema.columns WHERE table_schema = DATABASE() AND table_name=?1", nativeQuery = true)
		List<String> displayTables1(String tablename);
	 
}
