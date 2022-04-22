package com.moncept.dip.violation.test;

import com.moncept.dip.violation.LogType;
import com.moncept.dip.violation.TaxCalculator;

public class DipViolationTest {
	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator(LogType.FILE);
		System.out.println(calc.calculateTax(10, 2));
		System.out.println(calc.calculateTax(10, 0));
		System.out.println(calc.calculateTax(10, 5));
	}
}
