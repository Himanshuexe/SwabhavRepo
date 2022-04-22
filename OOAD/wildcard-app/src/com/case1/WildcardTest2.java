package com.case1;

import java.util.Arrays;
import java.util.List;

public class WildcardTest2 {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("hello", "Hello", "india");
		printDetails(names);

		List<Integer> nos = Arrays.asList(10, 20, 30, 40, 50);
		printDetails(nos);
		
		List<?> someSpecificReadonlyType =names;
		System.out.println(someSpecificReadonlyType);
		
		someSpecificReadonlyType=nos;
		System.out.println(someSpecificReadonlyType);
	}

	public static void printDetails(List<?> items) {
		items.forEach(item -> System.out.println(item));
	}
}
