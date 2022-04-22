package com.monocept.test;

import com.monocept.model.HatAdapter;
import com.monocept.model.Item;
import com.monocept.model.ShoppingCart;
import com.monocpt.model.Hat;

public class Test {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.add(new HatAdapter(new Hat("Yankee", "Baseball Cap", 5000)));
		cart.add(new HatAdapter(new Hat("Nike", "Sports Cap", 3000)));
		printDetails(cart);
	}

	public static void printDetails(ShoppingCart sCart) {
		System.out.println("No. of Items in cart: " + sCart.getCount() + "\nDetails:");
		for (Item item : sCart.getItems()) {
			System.out.println("Name: " + item.itemName());
			System.out.println("Price: " + item.itemPrice());
		}
		System.out.println("Total Price: " + sCart.totalPrice());
	}
}
