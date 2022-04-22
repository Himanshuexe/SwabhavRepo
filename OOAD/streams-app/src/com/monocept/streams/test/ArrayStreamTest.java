package com.monocept.streams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.monocept.model.Account;

public class ArrayStreamTest {
	public static void main(String[] args) {
//		caseStudy2();
//		caseStudy3();
		caseStudy4();
	}

	public static void caseStudy1() {
		String[] names = { "Himanshu", "Abhishek", "Vineet", "Rohan" };
		Arrays.stream(names).forEach(ArrayStreamTest::printDetails);
//		Arrays.stream(names).forEach(ArrayStreamTest::foo);
		Arrays.stream(names).forEach(n -> System.out.println(n));
		Arrays.stream(names).forEach(System.out::println);
	}

	public static void caseStudy2() {
		String[] names = { "Himanshu", "Abhishek", "Vineet", "Rohan" };
		Arrays.stream(names).filter(ArrayStreamTest::namesWithA).sorted(ArrayStreamTest::sortTheNames)
				.map(ArrayStreamTest::getFirstFourLetters).forEach(n -> System.out.println(n.toUpperCase()));
		;
	}

	public static void caseStudy3() {
		String[] names = { "Himanshu", "Abhishek", "Vineet", "Rohan" };

		Stream<String> sortedNamesStream = Arrays.stream(names).filter(ArrayStreamTest::namesWithA)
				.sorted(ArrayStreamTest::sortTheNames);
		sortedNamesStream.forEach(n -> System.out.println(n.toUpperCase()));
		sortedNamesStream.forEach(n -> System.out.println(n.toUpperCase()));

	}

	public static void caseStudy4() {
		Account[] accounts = { new Account(101, "Abhishek", 5000.0), new Account(102, "Vineet", 3000.0),
				new Account(103, "Rohan", 10000.0), new Account(104, "Shikhar", 15000.0) };
		// query1
		Account a = Arrays.stream(accounts).max(Comparator.comparing(Account::getBalance)).get();
		System.out.println(a);
		// query2
		Arrays.stream(accounts).filter(n -> n.getName().length() > 6).forEach(n -> {
			System.out.println(n.getName());
		});
		// query3
		Double sum1=Arrays.stream(accounts).mapToDouble(n -> n.getBalance()).sum();
		System.out.println("Sum of balances: "+sum1);
		
	}

	public static int sortTheNames(String n1, String n2) {
		return n2.compareTo(n1);
	}

	public static boolean namesWithA(String name) {
		return name.toLowerCase().contains("a");
	}

	public static String getFirstFourLetters(String name) {
		return name.substring(0, 4);
	}

	public static void printDetails(String name) {
		System.out.println(name);
	}

	public static void foo() {
	}
}
