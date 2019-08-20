package com.cg.ums.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ums.bean.Courses;
import com.cg.ums.service.CourseInterface;

@RestController
@RequestMapping("/courses")
@CrossOrigin(origins="http://localhost:4200")
public class CoursesController {

	@Autowired
	private CourseInterface courseService;
	@RequestMapping(value ="/savecourses", method = RequestMethod.POST)
	public Courses createCourses(@RequestBody Courses course ) {
		return  courseService.saveCoursesData(course);
	}
	@RequestMapping(value = "/getcoursedetails", method = RequestMethod.GET)
	public List<Courses> getCourseDetails() {
		return courseService.getCourseDetails();
	} 
	@RequestMapping(value = "/updatecourse", method = RequestMethod.PUT)
	public Courses updateCourse(@RequestBody Courses courses) {
		return courseService.updateCourse(courses);
	}
	
	@RequestMapping(value="/searchcourse",method=RequestMethod.GET)
	
	public Courses searchCouse(@RequestParam("cid") Integer courseId)
	{
		return courseService.searchByCourseId( courseId);
		
	}
	@RequestMapping(value = "/deletecourse/{cid}", method = RequestMethod.DELETE)
	public void delCourse(@PathVariable("cid") Integer cid) {
		courseService.deleteCourse(cid);

	}
	@DeleteMapping(value = "/deletecoursetable")
	public void  delTable() {
		courseService.truncateCourse();

	}
	
}
