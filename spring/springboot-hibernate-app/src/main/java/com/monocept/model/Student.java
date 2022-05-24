package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int rollNo;
	private String firstName;
	private String lastName;
	private double cgpa;
	
	public Student() {
	}

	public Student(int rollNo, String firstName, String lastName, double cgpa) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public double getCgpa() {
		return cgpa;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
}
