package com.monocept.model;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(1, "Himanshu");
		hMap.put(2, "Rohan");
		hMap.put(3, "Abhishek");
		hMap.put(4, "Vineet");
		hMap.put(5, "Himanshu");
		System.out.println(hMap);
	}
}
