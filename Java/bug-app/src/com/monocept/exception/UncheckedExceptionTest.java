package com.monocept.exception;

public class UncheckedExceptionTest {
	public static void main(String[] args) {
		try {
			m1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End of program");
	}

	public static void m1() {
		System.out.println("Inside m1");
		m2();
	}

	public static void m2() {
		System.out.println("Inside m2");
		m3();
	}

	public static void m3() {
		System.out.println("Inside m3");
		throw new RuntimeException("Something went wrong in m3");
	}
}
