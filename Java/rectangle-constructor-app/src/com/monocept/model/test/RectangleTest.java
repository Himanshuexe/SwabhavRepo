package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest extends Rectangle {
	public RectangleTest(int height, int width) {
		super(height, width);
	}

	public static void main(String[] args) {
		Rectangle small = new Rectangle(10, 5);
		printDetails(small);
		small.setWidth(20);
		printDetails(small);
	}

	public static void printDetails(Rectangle r) {
		System.out.println("Height: " + r.getHeight() + " Width: " + r.getWidth() + " Area: " + r.calculateArea());
	}
}
