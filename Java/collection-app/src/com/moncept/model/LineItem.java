package com.moncept.model;

public class LineItem {
	private int id;
	private String name;
	private int quantity;
	private double unitPrice;

	public LineItem(int id, String name, int quantity, double unitPrice) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public double calculateCost() {
		return unitPrice * quantity;
	}

	@Override
	public String toString() {
		return "Id: " + id + " Name: " + name + " Quantity: " + quantity + " Unit Price:" + unitPrice + " Cost: "
				+ calculateCost();

	}

	@Override
	public boolean equals(Object obj) {
		if (this.getClass() == obj.getClass()) {
			LineItem li = (LineItem) obj;
			if (this.id == li.id) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.id;
	}
}
