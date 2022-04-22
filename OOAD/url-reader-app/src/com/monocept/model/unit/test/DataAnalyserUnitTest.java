package com.monocept.model.unit.test;

import com.monocept.model.*;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class DataAnalyserUnitTest {

	@Test
	void findTheCeoTest() {
		DataAnalyser analyser = new DataAnalyser(new URLReader("https://swabhav-tech.firebaseapp.com/emp.txt"));
		Employee employee = analyser.findTheCEO();
		String ceoName = employee.getEmpName();
		assertTrue(employee.getManagerId().contains("NULL"));
		assertTrue(ceoName.contains("KING-WEB"));
	}

	@Test
	void jobWiseCountTest() {
		DataAnalyser analyser = new DataAnalyser(new URLReader("https://swabhav-tech.firebaseapp.com/emp.txt"));
		HashMap<String, Integer> employeeJobCount = (HashMap<String, Integer>) analyser.jobWiseCount();
		assertEquals(employeeJobCount.get("'PRESIDENT'"), 1);
		assertEquals(employeeJobCount.get("'SALESMAN'"), 4);
		assertEquals(employeeJobCount.get("'MANAGER'"), 3);
		assertEquals(employeeJobCount.get("'CLERK'"), 4);
		assertEquals(employeeJobCount.get("'ANALYST'"), 2);
	}
}
