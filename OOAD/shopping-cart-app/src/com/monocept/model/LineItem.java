package com.monocept.model;

import java.util.concurrent.atomic.AtomicInteger;

public class LineItem {
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1001);
	private int lineItemID;
	private Product product;
	private int quantity;

	public LineItem(int quantity, Product product) {
		lineItemID = ID_GENERATOR.getAndIncrement();
		this.quantity = quantity;
		this.product = product;
	}

	public int getLineItemID() {
		return lineItemID;
	}

	public int getQuality() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public double getItemCost() {
		return product.getPrice() * quantity;
	}

	public double getItemCostAfterDiscount() {
		return product.getPriceAfterDiscount() * quantity;
	}

}