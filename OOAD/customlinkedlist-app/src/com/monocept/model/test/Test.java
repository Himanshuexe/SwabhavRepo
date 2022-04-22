package com.monocept.model.test;

import com.monocept.model.CustomLinkedList;

public class Test {
	public static void main(String[] args) {
		CustomLinkedList<Integer> cl = new CustomLinkedList<Integer>();
		cl.add(10);
		cl.add(20);
		cl.add(30);
		cl.add(50);
		cl.deleteAt(3);
//		cl.display();
		for (Integer i : cl) {
			System.out.println(i);
		}

		CustomLinkedList<String> c2 = new CustomLinkedList<String>();
		c2.add("Himanshu");
		c2.add("Rohan");
		c2.add("Abhishek");
		for (String name : c2) {
			System.out.println(name);

		}
	}
}
