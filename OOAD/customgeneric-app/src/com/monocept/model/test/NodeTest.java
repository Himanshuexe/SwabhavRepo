package com.monocept.model.test;

import com.monocept.model.Node;

public class NodeTest {
	public static void main(String[] args) {
		Node<String> n1 = new Node<String>();
		n1.setData("Abhishek");
		Node<String> n2 = new Node<String>();
		n2.setData("Vineet");
		Node<String> n3 = new Node<String>();
		n3.setData("Rohan");

		n1.setNext(n2);
		n2.setNext(n3);
		printDetails(n1);
	}

	public static void printDetails(Node<String> n) {
		try {
			while (n.getData() != null) {
				System.out.println(n.getData() + " " + n.getData().getClass().getSimpleName());
				n = n.getNext();
			}
		} catch (Exception e) {
			System.out.println("No data in current node.");
		}
	}
}