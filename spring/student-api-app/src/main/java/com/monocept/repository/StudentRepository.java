package com.monocept.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.monocept.model.Student;

@Repository
public class StudentRepository {
	private List<Student> students;

	public StudentRepository() {
		students = new ArrayList<Student>();
		students.add(new Student(101, "Himanshu", "Saraswat", 8.8));
		students.add(new Student(102, "Abhishek", "Bilagi", 8.5));
		students.add(new Student(103, "Rohan", "Sahu", 8.9));
		students.add(new Student(104, "Shikhar", "Patel", 8.6));
		students.add(new Student(105, "Vineet", "Singh", 8.4));
	}

	public List<Student> getAll() {
		return students;
	}

	public Student getSingle(int rollNo) {
		Student student = null;
		for (Student std : students) {
			if (std.getRollNo() == rollNo) {
				student = std;
			}
		}
		return student;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
}
