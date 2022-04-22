package com.monocept.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(100);
	private int OrderId;
	private String date;
	private List<LineItem> items = new ArrayList<LineItem>();
	private List<LineItem> LineItems = new ArrayList<LineItem>();
	private static int ItemCount;

	public Order(String date) {
		OrderId = ID_GENERATOR.getAndIncrement();
		this.date = date;
	}

	public int getId() {
		return OrderId;
	}

	public String getDate() {
		return date;
	}

	public int ItemCount() {
		ItemCount++;
		return ItemCount;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void addItem(LineItem item) {
		LineItems.add(item);
	}
}