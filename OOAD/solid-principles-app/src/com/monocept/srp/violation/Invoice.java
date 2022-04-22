package com.monocept.srp.violation;

public class Invoice {
	private String id;
	private String description;
	private double amount;
	private float tax;
	private double discountPercent;

	public Invoice(String id, String description, double amount, float tax, double discountPercent) {
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
		this.discountPercent = discountPercent;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public float getTax() {
		return tax;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public double calculateTax() {
		return (amount - calculateDiscount()) * tax / 100;
	}

	public double calculateDiscount() {
		return amount * discountPercent / 100;
	}

	public double calculateTotal() {
		return (amount - calculateDiscount()) + calculateTax();
	}

	public void printInvoice() {
		System.out.println("Invoice Id: " + getId() + "\nDescription: " + getDescription() + "\nAmount: " + getAmount()
				+ "\nDiscount: " + calculateDiscount() + "\nTax: " + calculateTax() + "\nTotal: " + calculateTotal());
	}
}
