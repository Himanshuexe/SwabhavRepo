package com.monocept.model;

public class Customer {
	private String name;
	private String location;
	private double amount;
	private String id;
	private static int customerNo;

	public Customer(String name, String location, double amount) {
		this.name = name;
		this.location = location;
		this.amount = amount;
		this.id = "C" + customerNo++;
		// customerNo++;
	}

	static {
		customerNo = 1001;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public double getAmount() {
		return amount;
	}

	public String getId() {
		return id;
	}
}
