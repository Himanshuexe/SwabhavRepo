package com.monocept.facade;

public abstract class FooDb {
	private IDataAccessible order;
	private IDataAccessible customer;
	private IDataAccessible department;

	public FooDb() {
		order = new OrderDb();
		customer = new CustomerDb();
		department = new DepartmentDb();
	}

	public void createOrder() {
		order.create();
	}

	public void createCustomer() {
		customer.create();
	}

	public void createDepartment() {
		department.create();
	}
}
