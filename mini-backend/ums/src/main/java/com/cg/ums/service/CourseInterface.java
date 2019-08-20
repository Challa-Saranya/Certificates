package com.cg.ums.service;

import java.util.List;


import com.cg.ums.bean.Courses;

public interface CourseInterface {

	Courses saveCoursesData(Courses course);

	List<Courses> getCourseDetails();

	Courses updateCourse(Courses courses);

	Courses searchByCourseId(Integer courseId);

	void deleteCourse(Integer cid);
	void truncateCourse();

}
