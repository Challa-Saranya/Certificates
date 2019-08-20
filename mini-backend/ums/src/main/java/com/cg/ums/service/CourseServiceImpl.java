package com.cg.ums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.ums.bean.Courses;
import com.cg.ums.dao.CourseRepository;
@Service
public class CourseServiceImpl implements CourseInterface{
@Autowired
CourseRepository courserepository;

	@Override
	public Courses saveCoursesData(Courses course) {
		
		return courserepository.save(course);
	}
	@Override
	public List<Courses> getCourseDetails() {
		
		return courserepository.findAll();
	}
	@Override
	public Courses updateCourse(Courses courses) {
	
		return courserepository.save(courses);
	}
	@Override
	public Courses searchByCourseId(Integer courseId) {
		
		return courserepository.findById(courseId).get();
	}
	@Override
	public void deleteCourse(Integer cid) {
		courserepository.deleteById(cid);
		
	}
	@Override
	public void truncateCourse() {
		courserepository.truncateCourse();
		
	}

	

}
