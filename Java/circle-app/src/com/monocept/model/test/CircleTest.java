package com.monocept.model.test;

import com.monocept.model.Circle;

import com.monocept.model.BorderOptions;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(5.5f);
		Circle c2 = new Circle(7.5f, BorderOptions.DOTTED);
		Circle c3 = new Circle(10.5f, BorderOptions.DOTTED);
		printDetails(c1);
		printDetails(c2);
		printDetails(c3);

		Circle[] circles = { c1, c2, c3 };
		System.out.println("Largest circle is: ");
		printDetails(findLargestCircle(circles));
	}

	public static void printDetails(Circle c) {
		System.out.println("Radius: " + c.getRadius() + ", Border: " + c.getBorder() + ", Area: " + c.calculateArea());
	}

	public static Circle findLargestCircle(Circle[] circles) {
		Circle largest = circles[0];
		for (Circle c : circles) {
			if (c.getRadius() > largest.getRadius()) {
				largest = c;
			}
		}
		return largest;
	}
}