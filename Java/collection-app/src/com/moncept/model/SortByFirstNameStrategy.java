package com.moncept.model;

import java.util.Comparator;

public class SortByFirstNameStrategy implements Comparator<Student> {

	public SortByFirstNameStrategy() {
	}

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.getFirstName().compareToIgnoreCase(o2.getFirstName()));
	}
}
