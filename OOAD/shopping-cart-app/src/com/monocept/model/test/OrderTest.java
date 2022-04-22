package com.monocept.model.test;

import com.monocept.model.*;

public class OrderTest {

	public static void main(String[] args) {
		System.out.println("Order Test");
		Order o1 = new Order("12/12/2022");
		Order o2 = new Order("11/11/2021");
		printDetails(o1);
		System.out.println("---------------------");
		printDetails(o2);
	}

	private static void printDetails(Order o) {
		System.out.println("Order Count: " + o.ItemCount());
		System.out.println("Order ID:" + o.getId());
		System.out.println("Order Date:" + o.getDate());
	}

}