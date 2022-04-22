package com.monocept.model;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> tS = new TreeSet<String>();
		tS.add("Himanshu");
		tS.add("Rohan");
		tS.add("Abhishek");
		tS.add("Vineet");
		tS.add("Himanshu");
		System.out.println(tS);
	}
}
