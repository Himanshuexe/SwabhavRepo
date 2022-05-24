package com.monocept.test;

import com.monocept.model.Student;
import com.monocept.repository.DatabaseRepository;
import com.monocept.repository.FileRepository;
import com.monocept.repository.StudentRepository;

public class BridgePatternTest {
	public static void main(String[] args) {
		Student student = new Student(101, "Himanshu");
		// code to store in file
		StudentRepository fileRepositroy = new StudentRepository(new FileRepository());
		fileRepositroy.save(student);

		// code to store in DataBase
		StudentRepository dbRepositroy = new StudentRepository(new DatabaseRepository());
		dbRepositroy.save(student);
	}
}
