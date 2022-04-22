package com.monocept.dip.solution.test;

import com.monocept.dip.solution.*;

public class DSPSolutionTest {
	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator(new DBLogger());
		System.out.println(calc.calculateTax(10, 2));
		System.out.println(calc.calculateTax(10, 0));

		TaxCalculator calc1 = new TaxCalculator((String err) -> {
			System.out.println("Error Logged in Xml");
		});
		System.out.println(calc1.calculateTax(10, 0));

		TaxCalculator calc3 = new TaxCalculator(DSPSolutionTest::consoleLogger);
		System.out.println(calc3.calculateTax(10, 0));
	}

	static void consoleLogger(String err) {
		System.out.println("Error Logged to Console.");
	}

}
