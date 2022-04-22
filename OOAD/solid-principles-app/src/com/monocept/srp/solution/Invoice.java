package com.monocept.srp.solution;

public class Invoice {
	private static String id;
	private static String description;
	private static double amount;
	private static float tax;
	private static double discountPercent;

	public Invoice(String id, String description, double amount, float tax, double discountPercent) {
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
		this.discountPercent = discountPercent;
	}

	public static String getId() {
		return id;
	}

	public static String getDescription() {
		return description;
	}

	public static double getAmount() {
		return amount;
	}

	public float getTax() {
		return tax;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public static double calculateTax() {
		return (amount - calculateDiscount()) * tax / 100;
	}

	public static double calculateDiscount() {
		return amount * discountPercent / 100;
	}

	public double calculateTotal() {
		return (amount - calculateDiscount()) + calculateTax();
	}

	public Invoice getInvoice(Invoice invoice) {
		return invoice;
	}
}
