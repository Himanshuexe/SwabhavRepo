package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest {

	public static void main(String args[]) {
		Rectangle small = new Rectangle();
		Rectangle big = new Rectangle();
		small.length = 10;
		small.height = 5;
		big.length = 100;
		big.height = 50;

		System.out.println("Length of small rectangle: " + small.length);
		System.out.println("Height of small rectangle: " + small.height);
		System.out.println("Area of small rectangle: " + small.calculateArea());

		System.out.println("Length of big rectangle: " + big.length);
		System.out.println("Height of big rectangle: " + big.height);
		System.out.println("Area of big rectangle: " + big.calculateArea());
	}
}
