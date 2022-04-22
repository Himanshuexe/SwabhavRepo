package com.monocept.model.test;

import com.monocept.model.*;

public class ProductTest {

	public static void main(String[] args) {
		System.out.println("Product Test");

		Product p1 = new Product("Samsung Mobile", 10000, 50.0);
		Product p2 = new Product("Samsung AC", 4000, 2.0);
		printDetails(p1);
		System.out.println("---------------");
		printDetails(p2);
	}

	private static void printDetails(Product p) {
		System.out.println("Product ID: " + p.getId());
		System.out.println("Product Name: " + p.getName());
		System.out.println("Price: " + p.getPrice());
		System.out.println("Product After discount: " + p.getPriceAfterDiscount());
	}

}