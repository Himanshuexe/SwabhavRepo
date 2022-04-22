package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleArrayTest extends Rectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(20);

		Rectangle r2 = new Rectangle();
		r2.setWidth(40);
		r2.setHeight(50);

		Rectangle[] manyRectangles = new Rectangle[3];
		manyRectangles[0] = r1;
		manyRectangles[1] = r2;
		manyRectangles[2] = new Rectangle();

		manyRectangles[2].setWidth(10);
		manyRectangles[2].setHeight(10);

		for (Rectangle r : manyRectangles) {
			printDetails(r);
		}
	}

	public static void printDetails(Rectangle r) {
		System.out.println("Height: " + r.getHeight() + " Width: " + r.getWidth() + " Area: " + r.calculateArea());
	}

}
