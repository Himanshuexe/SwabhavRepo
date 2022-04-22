package com.monocept.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(200);
	private int id;
	private String name;
	private double price;
	private double discount;

	public Product(String name, double price, double discout) {
		id = ID_GENERATOR.getAndIncrement();
		this.name = name;
		this.price = price;
		this.discount = discout;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getdiscount() {
		return discount;
	}

	public double getPriceAfterDiscount() {

		return price - discount;
	}
}
