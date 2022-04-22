package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest extends Rectangle {
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		r.setWidth(-30);
		r.setHeight(1000);
		System.out.println("The width of the rectangle is " + r.getWidth() + ",The height of the rectangle is "
				+ r.getHeight() + " and the area is: " + r.calculateArea());
	}
}
