package com.monocept.model;

import javax.persistence.*;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private float cgpa;

	public Student(int id, String name, float cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setName(String name) {
		this.name = name;
	}

}
