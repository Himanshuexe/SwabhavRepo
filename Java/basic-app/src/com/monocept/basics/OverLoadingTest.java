package com.monocept.basics;

public class OverLoadingTest {
	public static void printInfo(int value) {
		System.out.println("The value is integer: " + value);
	}

	public static void printInfo(char value) {
		System.out.println("The value is character: " + value);

	}

	public static void printInfo(String value) {
		System.out.println("The value is String: " + value);
	}

	public static void printInfo(double value) {
		System.out.println("The value is double: " + value);
	}

	public static void printInfo(float value) {
		System.out.println("The value is float: " + value);
	}

	public static void printInfo(boolean value) {
		System.out.println("The value is boolean: " + value);
	}

	public static void main(String[] args) {
		printInfo(10);
		printInfo('a');
		printInfo("hello");
		printInfo(.5f);
		printInfo(100.55);
		printInfo(true);
	}
}