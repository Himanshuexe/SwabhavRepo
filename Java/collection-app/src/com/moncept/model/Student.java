package com.moncept.model;

import java.util.Set;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String firstName;
	private String lastName;
	private int standard;
	private double cgpa;

	public Student(int rollNo, String firstName, String lastName, int standard, double cgpa) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.standard = standard;
		this.cgpa = cgpa;
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

	public int getStandard() {
		return standard;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int compareTo(Student o) {
		if (this.rollNo - o.rollNo > 0) {
			return 1;
		}
		if (this.rollNo - o.rollNo < 0) {
			return -1;
		}
		return 0;
	}
}