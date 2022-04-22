package com.monocept.model;

public class Rectangle {
	private int width;
	private int height;

	public int calculateArea() {
		return width * height;
	}

	public void setWidth(int width) {
		this.width = validate(width);
	}

	public void setHeight(int height) {
		this.height = validate(height);
	}

	private int validate(int side) {
		if (side > 0 && side < 101) {
			return side;
		}
		if (side < 1) {
			return 1;
		}
		if (side > 100) {
			return 100;
		}
		return side;

	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}
}
