package com.cg.ums.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.ums.bean.Courses;

@Repository
public interface CourseRepository  extends JpaRepository<Courses, Integer> {


	@Modifying
	@Query(value ="truncate table courses",nativeQuery=true)
	void truncateCourse();
}
