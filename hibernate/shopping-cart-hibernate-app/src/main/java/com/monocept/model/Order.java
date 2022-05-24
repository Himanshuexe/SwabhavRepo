package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Columns;

@Entity
public class Order {
	@Id
	private int id;
	@Column(name = "UserName")
	private String data;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<LineItem> items;

	public Order(int id, String data) {

		this.id = id;
		this.data = data;
		this.items = new ArrayList<LineItem>();
	}

	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void addItem(LineItem li) {
		items.add(li);
	}

	public int getItemCount() {
		return items.size();
	}

	public double checkoutPrice() {
		double price = 0.0;
		for (LineItem li : getItems()) {
			price += li.calculateCost();
		}
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}

}