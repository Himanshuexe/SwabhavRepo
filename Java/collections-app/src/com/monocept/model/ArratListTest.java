package com.monocept.model;

import java.util.ArrayList;
import java.util.Iterator;

public class ArratListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Himanshu");
		list.add("Rohan");
		list.add("Abhishek");
		list.add("Vineet");
		list.remove("Vineet");
		System.out.println(list);

		Iterator<String> s = list.iterator();
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}
}
