package com.cg.ums.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
	@Id
	private Integer courseId;
	private String courseName;
	private Integer courseDuration;
	private Integer noOfSems;
	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", noOfSems=" + noOfSems + "]";
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(Integer courseDuration) {
		this.courseDuration = courseDuration;
	}
	public Integer getNoOfSems() {
		return noOfSems;
	}
	public void setNoOfSems(Integer noOfSems) {
		this.noOfSems = noOfSems;
	}
	public Courses(Integer courseId, String courseName, Integer courseDuration, Integer noOfSems) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.noOfSems = noOfSems;
	}
	
}
