package com.monocept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Student;
import com.monocept.repository.StudentRepository;

@Service("StudentSrv")
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public StudentService() {
		System.out.println("Student Service created");
	}

	public List<Student> getAll() {
		return studentRepository.getAll();
	}

	public Student getSingle(int rollNo) {
		return studentRepository.getSingle(rollNo);
	}

	public void addStudent(Student student) {
		studentRepository.addStudent(student);
	}

}
