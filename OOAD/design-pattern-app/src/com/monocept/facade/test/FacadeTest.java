package com.monocept.facade.test;

import com.monocept.facade.*;

public class FacadeTest {
	public static void main(String[] args) {
		FooDb db = new FooDb() {
		};
		db.createOrder();
		db.createCustomer();
		db.createDepartment();
	}
}
