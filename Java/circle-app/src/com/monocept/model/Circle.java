package com.monocept.model;

public class Circle {
	private float radius;
	private BorderOptions border = BorderOptions.SOLID;

	public Circle(float radius) {
		this.radius = radius;
	}

	public Circle(float radius, BorderOptions border) {
		this.radius = radius;
		this.border = border;
	}

	public float calculateArea() {
		return (float) (3.14 * radius * radius);
	}

	public float getRadius() {
		return this.radius;
	}

	public BorderOptions getBorder() {
		return this.border;
	}
}
