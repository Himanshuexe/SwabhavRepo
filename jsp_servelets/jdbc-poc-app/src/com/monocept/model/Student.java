package com.monocept.model;

public class Student {
	private int id;
	private String name;
	private String dept;
	private int collegeId;

	public Student(int id, String name, String dept, int collegeId) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.collegeId = collegeId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public int getCollegeId() {
		return collegeId;
	}

}
