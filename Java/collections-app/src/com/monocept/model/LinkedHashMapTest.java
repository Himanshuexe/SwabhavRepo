package com.monocept.model;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lHMap = new LinkedHashMap<Integer, String>();
		lHMap.put(1, "Himanshu");
		lHMap.put(2, "Rohan");
		lHMap.put(3, "Abhishek");
		lHMap.put(4, "Vineet");
		lHMap.put(5, "Himanshu");
		System.out.println(lHMap);
	}
}
