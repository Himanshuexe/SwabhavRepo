package com.monocept.model;

import java.io.Serializable;

public class Student extends BaseEntity implements Serializable{
	private int id;
	private String name;

	public Student(int id, String name) {
	}

	public int getStudentId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
