package com.monocept.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.monocept.model.Course;
import com.monocept.model.Student;

public class StudentService {
	private static StudentService instance;
	private List<Student> students = new ArrayList<Student>();

	private StudentService() {
		System.out.println("Student Service Started");
		List<Course> courses1 = new ArrayList<Course>();
		courses1.add(new Course("C101", "JAVA", 1500));
		courses1.add(new Course("C102", "C Programming", 1000));
		List<Course> courses2 = new ArrayList<Course>();
		courses2.add(new Course("C101", "JAVA", 1500));
		courses2.add(new Course("C102", "C Programming", 1000));
		courses2.add(new Course("C103", "Python", 1200));
		
		students.add(new Student(101, "Himanshu", "Saraswat", 8.8, courses1));
		students.add(new Student(102, "Abhishek", "Bilagi", 8.5, courses2));
		students.add(new Student(103, "Rohan", "Sahu", 8.6, courses2));
		students.add(new Student(104, "Vineet", "Singh", 8.4, courses1));
		students.add(new Student(105, "Shikhar", "Patel", 8.5, courses2));
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
