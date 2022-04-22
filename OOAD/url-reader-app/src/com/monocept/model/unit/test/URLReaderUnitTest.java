package com.monocept.model.unit.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import com.monocept.model.Employee;
import com.monocept.model.URLReader;

class URLReaderUnitTest {

	@Test
	void urlReaderImportingCorrectly() {
		URLReader reader = new URLReader("https://swabhav-tech.firebaseapp.com/emp.txt");
		Set<Employee> employees = new HashSet<Employee>();
		int beforeImport = employees.size();
		employees = reader.read();
		int afterImport = employees.size();
		assertFalse(beforeImport == afterImport);
	}

	@Test
	void dataDuplicacyTesy() {
		URLReader reader = new URLReader("https://swabhav-tech.firebaseapp.com/emp.txt");
		int expectedEmployeeCount = 14;
		Set<Employee> employees = new HashSet<Employee>();
		employees = reader.read();
		int actualEmployeeCount = employees.size();
		assertTrue(actualEmployeeCount == expectedEmployeeCount);
	}
}
