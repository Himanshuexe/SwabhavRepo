package com.monocept.demo;

public class OddEvenCheckPrint {
	private static int a;
	private static int b;

	public static void printOddEvenNumbers(int x, int y) {
		a = x;
		b = y;
		printOddNumbers(x, y);
		printEvenNumbers(x, y);
	}

	public static void printOddNumbers(int x, int y) {
		System.out.println("Odd Numbers: ");
		for (int i = x; i <= y; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}
		}
	}

	public static void printEvenNumbers(int x, int y) {
		System.out.println("Even Numbers: ");
		for (int i = x; i <= y; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
	}
}
