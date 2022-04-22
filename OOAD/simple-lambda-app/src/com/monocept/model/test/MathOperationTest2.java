package com.monocept.model.test;

import java.util.function.IntFunction;
import java.util.function.Predicate;

public class MathOperationTest2 {
	public static void main(String[] args) {

		IntFunction<Long> x;
		x = MathOperationTest2::cubeEvenNumber;
		System.out.println("Cube of 4: " + x.apply(4));
		System.out.println("Cube of 3: " + x.apply(3));

		Predicate<Integer> y;
		y = MathOperationTest2::checkEven;
		System.out.println("Is 4 Even? " + y.test(4));
		System.out.println("Is 3 Even? " + y.test(3));
	}

	public static long cubeEvenNumber(int n) {
		return (n % 2 == 0) ? n * n * n : n;
	}

	public static boolean checkEven(int n) {
		return (n % 2 == 0) ? true : false;
	}
}
