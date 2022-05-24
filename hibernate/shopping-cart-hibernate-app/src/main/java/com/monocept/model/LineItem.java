package com.monocept.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class LineItem {
	@Id
	private int id;
	private int quantity;

	@OneToOne(mappedBy = "line_Item", cascade = CascadeType.ALL)
	private Product product;
	@ManyToOne
	@JoinColumn(name = "Order_id")
	private Order order;

	public LineItem() {

	}

	public LineItem(int id, int quantity, Product product) {

		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public double calculateCost() {
		return quantity * product.calculatePriceAfterDiscount();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}