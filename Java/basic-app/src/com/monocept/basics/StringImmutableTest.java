package com.monocept.basics;

public class StringImmutableTest {
	public static void main(String args[]) {
		caseStudy1();
		caseStudy2();

	}

	public static void caseStudy1() {
		String userName = "Rohan";
		System.out.println(userName);
		System.out.println(userName.toUpperCase());
		System.out.println(userName);
	}
	public static void caseStudy2() {
		String userName = "Rohan";
		System.out.println(userName.hashCode());
		userName += "Monocept";
		System.out.println(userName.hashCode());
		userName += "Hyderabad";
		System.out.println(userName.hashCode());
	}

}
