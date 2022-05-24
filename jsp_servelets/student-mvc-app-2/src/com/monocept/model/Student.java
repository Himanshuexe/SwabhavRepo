package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int rollNo;
	private String firstName;
	private String lastName;
	private double cgpa;
	List<Course> courses = new ArrayList<Course>();

	public Student(int rollNo, String firstName, String lastName, double cgpa, List<Course> courses) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.courses = courses;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getCgpa() {
		return cgpa;
	}

	public List<Course> getCourses() {
		return courses;
	}
}
