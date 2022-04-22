package com.monocept.model;

public class Rectangle {
	private int width;
	private int height;
	

	public Rectangle(int height, int width) {
		this.width = width;
		this.height = height;
	}
	private String color = "Red";
	public Rectangle(int height, int width, String color) {
		this.width = width;
		this.height = height;
		this.color = validate(color);
	}

	public int calculateArea() {
		return width * height;
	}

	public void setWidth(int width) {
		this.width = validate(width);
	}

	public void setColor(String color) {
		this.color = validate(color);
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

	private String validate(String c) {
		if (c.equalsIgnoreCase("red") || c.equalsIgnoreCase("Blue") || c.equalsIgnoreCase("Green")) {
			return c;
		}
		return "Red";
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public String getColor() {
		return this.color;
	}
}
