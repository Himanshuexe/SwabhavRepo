package com.monocept.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	private int StudentId;
	private String sName;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Course> courses = new HashSet<Course>();

	public Student() {
	}

	public Student(int id, String name, Set<Course> courses) {
		this.StudentId = id;
		this.sName = name;
		this.courses = courses;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}
