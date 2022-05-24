package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	private int courseId;
	private String courseName;

	public Course() {
	}

	public Course(int cId, String cName) {
		this.courseId = cId;
		this.courseName = cName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
