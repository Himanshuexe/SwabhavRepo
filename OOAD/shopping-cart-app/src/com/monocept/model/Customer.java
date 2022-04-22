package com.monocept.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1001);
	private int Customerid;
	private String name;
	private List<Order> orders = new ArrayList<Order>();
	private static int orderCount;

	public Customer(String name) {
		Customerid = ID_GENERATOR.getAndIncrement();
		this.name = name;
	}

	public int getId() {
		return Customerid;
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public int orderCount() {
		orderCount++;
		return orderCount;
	}
}