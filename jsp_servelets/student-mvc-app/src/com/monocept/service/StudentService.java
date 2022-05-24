package com.monocept.service;

import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Student;

public class StudentService {
	private static StudentService instance;
	private List<Student> students = new ArrayList<Student>();

	private StudentService() {
		System.out.println("Student Service Started");
		students.add(new Student(101, "Himanshu", "Saraswat", 8.8));
		students.add(new Student(102, "Abhishek", "Bilagi", 8.5));
		students.add(new Student(103, "Rohan", "Sahu", 8.6));
		students.add(new Student(104, "Vineet", "Singh", 8.4));
		students.add(new Student(105, "Shikhar", "Patel", 8.5));
	}

	public static StudentService getInstance() {
		StudentService result = instance;
		if (result == null) {
			result = instance;
			instance = result = new StudentService();
		}
		return instance;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void add(Student student) {
		students.add(student);
	}
}
