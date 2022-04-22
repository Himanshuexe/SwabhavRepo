package com.monocept.model.test;

import com.monocept.model.*;

public class LineItemCostTest {

	public static void main(String[] args) {
		System.out.println("Line Item Test");
		Product p1 = new Product("Samsung", 15000.0, 2000.0);
		Product p2 = new Product("Apple", 50000.0, 1000.0);
		LineItem l1 = new LineItem(1, p1);
		LineItem l2 = new LineItem(2, p2);
		printDetails(l1);
		System.out.println("---------------------");
		printDetails(l2);
	}

	private static void printDetails(LineItem l) {
		System.out.println("ID:" + l.getLineItemID());
		System.out.println("Quantity: " + l.getQuality());
		System.out.println("Item Cost:" + l.getItemCost());
		System.out.println("After Disc: " + l.getItemCostAfterDiscount());

	}

}
