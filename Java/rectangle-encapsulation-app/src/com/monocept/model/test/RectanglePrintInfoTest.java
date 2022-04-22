package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectanglePrintInfoTest extends Rectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(20);
		printDetails(r1);

		Rectangle r2 = new Rectangle();
		r2.setWidth(100);
		r2.setHeight(200);
		printDetails(r2);
	}

	public static void printDetails(Rectangle r) {
		System.out.println("Height: " + r.getHeight() + " Width: " + r.getWidth() + " Area: " + r.calculateArea());
	}
}
