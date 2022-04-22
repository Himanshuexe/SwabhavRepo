package com.monocept.model.test;

import java.util.function.IntFunction;

import com.monocept.model.AddOperation;
import com.monocept.model.IMathOperation;

public class MathOperationTest {
	public static void main(String[] args) {

		IMathOperation z;
		// class
		z = new AddOperation();
		System.out.println("Result of addition: " + z.doOperation(10, 20));

		// Anonymous Class
		z = new IMathOperation() {

			@Override
			public long doOperation(int a, int b) {
				return a - b;
			}
		};
		System.out.println("Result of Substraction: " + z.doOperation(10, 5));

		// lambda
		z = (n1, n2) -> n1 * n2;
		System.out.println("Result of Multiplication: " + z.doOperation(20, 5));

		// method refernce
		z = MathOperationTest::m1;
		System.out.println("Result of Division: " + z.doOperation(10, 2));
	}

	static long m1(int a, int b) {
		return a / b;
	}
}
