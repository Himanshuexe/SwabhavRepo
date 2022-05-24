package com.monocept.model;

public class Student {
	private int rollno;
	private String name;
	private float cgpa;

	public Student(int rollno, String name, float cgpa) {
		this.rollno = rollno;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public float getCgpa() {
		return cgpa;
	}
}
