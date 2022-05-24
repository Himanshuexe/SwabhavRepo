package com.monocept.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

public class ShoppinCartTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory facotry = cfg.configure().buildSessionFactory();
		System.out.println(facotry.getClass());

		Session session = facotry.openSession();
		System.out.println(session.getClass());

		Transaction txn = session.beginTransaction();
		System.out.println(txn.getClass());

		Product pr1 = new Product(1, "salt", 350, 10);

		LineItem li1 = new LineItem(2, 12, pr1);

		pr1.setLineItem(li1);

		li1.setProduct(pr1);

		List<LineItem> items = new ArrayList<LineItem>();
		items.add(li1);

		Order or1 = new Order(12, "rohan list");

		li1.setOrder(or1);
		or1.setItems(items);

		session.save(or1);
		// session.save(li1);

		txn.commit();

		System.out.println("end of main");
	}
}