package com.monocept.model;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet<String> lHSet = new LinkedHashSet<String>();
		lHSet.add("Himanshu");
		lHSet.add("Rohan");
		lHSet.add("Abhishek");
		lHSet.add("Vineet");
		lHSet.add("Himanshu");
		System.out.println(lHSet);
	}
}
