package com.monocept.model.test;

import com.monocept.model.*;

public class CustomerTest {

	public static void main(String[] args) {
		System.out.println("Customer Test");
		Customer c1 = new Customer("Abhishek");
		Customer c2 = new Customer("Rohan");
		printDetails(c1);
		System.out.println("----------------");
		printDetails(c2);
	}

	private static void printDetails(Customer c) {
		System.out.println("Customer Count:" + c.orderCount());
		System.out.println("Customer ID:" + c.getId());
		System.out.println("Customer Name:" + c.getName());
	}

}