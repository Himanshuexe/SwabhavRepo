package com.monocept.model;

import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Integer, String> tM = new TreeMap<Integer, String>();
		tM.put(1, "Himanshu");
		tM.put(2, "Rohan");
		tM.put(3, "Abhishek");
		tM.put(4, "Vineet");
		tM.put(5, "Himanshu");
		System.out.println(tM);
	}
}
