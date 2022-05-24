package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	private int id;
	private String name;
	private double price;
	private double discount;

	@OneToOne
	private LineItem line_Item;

	public Product() {

	}

	public Product(int id, String name, double price, double discount) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
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

	public double getDiscount() {
		return discount;
	}

	public double calculatePriceAfterDiscount() {
		return price - (discount / 100.00) * price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void setLineItem(LineItem lineItem) {
		this.line_Item = lineItem;
	}

}