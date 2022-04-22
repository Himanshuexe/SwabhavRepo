package com.moncept.model;

import java.util.Comparator;

public class SortByLastNameStrategy implements Comparator<Student> {

	public SortByLastNameStrategy() {
	}

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.getLastName().compareToIgnoreCase(o2.getLastName()));
	}
}
