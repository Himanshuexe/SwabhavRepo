package com.monocept.model;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Himanshu");
		set.add("Rohan");
		set.add("Abhishek");
		set.add("Vineet");
		set.add("Himanshu");
		System.out.println(set);
	}
}
