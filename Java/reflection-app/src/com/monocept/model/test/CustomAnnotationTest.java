package com.monocept.model.test;

import com.monocept.model.Person;
import com.monocept.model.Reflector;

public class CustomAnnotationTest {
	public static void main(String[] args) {
		Reflector.findNeedRefactoringMethods(Person.class);
	}
}
