package com.monocept.service;

import java.util.List;

import com.monocept.model.Student;
import com.monocept.repository.StudentRepository;

public class StudentService {
	private static StudentService instance;
	private static Object mutex = new Object();
	private StudentRepository studentRepository;
	private List<Student> students;

	private StudentService() {
		System.out.println("Student Service Started");
	}

	public static StudentService getInstance() {
		StudentService result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new StudentService();
			}
		}
		return instance;
	}

	public List<Student> getStudents(int start) {
		studentRepository = new StudentRepository();
		students = studentRepository.getStudents(start);
		return students;
	}

	public void add(Student student) {
		studentRepository.addStudent(student);
	}

	public void editStudent(Student student) {
		studentRepository.editStudent(student);
	}

	public void delete(Student student) {
		studentRepository.deleteStudent(student);
	}
}
