package com.monocept.demo.test;

public class BoxingTest {
	public static void main(String args[]) {
		int a = 20;
		Integer i = Integer.valueOf(a); // Boxing
		Integer j = a; // Autoboxing
		System.out.println(a + " " + i + " " + j);

		Integer b = new Integer(10);
		int x = b.intValue();  // changing into primitive manually
		int y = b;  // Unboxing

		System.out.println(b + " " + x + " " + y);
	}
}
