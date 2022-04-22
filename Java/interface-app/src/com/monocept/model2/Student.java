package com.monocept.model2;

public class Student extends Person {
	private String branch;

	public Student(int id, String address, String dob, String branch) {
		super(id, address, dob);
		this.branch = branch;
	}

	public String details() {
		return "Branch: " + branch;

	}
}
