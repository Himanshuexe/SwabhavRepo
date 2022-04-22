package com.monocept.model.test;

import java.util.Set;
import java.util.TreeSet;

import com.moncept.model.SortByCgpaStrategy;
import com.moncept.model.SortByFirstNameStrategy;
import com.moncept.model.SortByLastNameStrategy;
import com.moncept.model.Student;

public class StudentSortingTest {
	public static void main(String[] args) {
		Set<Student> studentSet = null;
		//studentSet = new TreeSet<Student>(new SortByFirstNameStrategy());
		studentSet.add(new Student(102, "Rohan", "k", 10, 8.55));
		studentSet.add(new Student(102, "Rohan", "k", 10, 8.55));
		studentSet.add(new Student(103, "Abhishek", "B", 10, 7.66));
		studentSet.add(new Student(101, "Himanshu", "s", 10, 7.5));
		System.out.println("Sorted by First Name:");
		printDetails(studentSet);
		
		studentSet = new TreeSet<Student>(new SortByLastNameStrategy());
		studentSet.add(new Student(102, "Rohan", "k", 10, 8.55));
		studentSet.add(new Student(102, "Rohan", "k", 10, 8.55));
		studentSet.add(new Student(103, "Abhishek", "B", 10, 7.66));
		studentSet.add(new Student(101, "Himanshu", "s", 10, 7.5));
		System.out.println("Sorted by Last Name:");
		printDetails(studentSet);
		
		studentSet = new TreeSet<Student>(new SortByCgpaStrategy());
		studentSet.add(new Student(102, "Rohan", "k", 10, 8.55));
		studentSet.add(new Student(102, "Rohan", "k", 10, 8.55));
		studentSet.add(new Student(103, "Abhishek", "B", 10, 7.66));
		studentSet.add(new Student(101, "Himanshu", "s", 10, 7.5));
		System.out.println("Sorted by CGPA:");
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
