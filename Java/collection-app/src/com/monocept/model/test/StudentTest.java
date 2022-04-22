package com.monocept.model.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import com.moncept.model.*;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> studentList;
		// studentList = new ArrayList<Student>();
		studentList = new LinkedList<Student>();
		studentList.add(new Student(101, "Himanshu", "s", 10, 7.5f));
		studentList.add(new Student(101, "Himanshu", "s", 10, 7.5f));
		printDetails(studentList);

		Set<Student> studentSet;
		// studentSet = new HashSet<Student>();
		studentSet = new TreeSet<Student>();
		studentSet.add(new Student(102, "Rohan", "k", 10, 8.55));
		studentSet.add(new Student(102, "Rohan", "k", 10, 8.55));
		studentSet.add(new Student(103, "Abhishek", "B", 10, 7.66));
		studentSet.add(new Student(101, "Himanshu", "s", 10, 7.5));

		printDetails(studentSet);
	}

	public static void printDetails(Iterable<Student> s) {
		for (Student student : s) {
			System.out.println("RollNo: " + student.getRollNo() + " First Name: " + student.getFirstName()
					+ " Last Name: " + student.getLastName() + " Standard: " + student.getStandard() + " CGPA: "
					+ student.getCgpa());
		}
	}
}
