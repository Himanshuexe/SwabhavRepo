package com.monocept.model;

public class FoochildDb extends FooDb {

	@Override
	public void read() {
		System.out.println("Reading Foochild Record.");
	}

	@Override
	public void update() {
		System.out.println("Updating Foochild Record.");
	}

	@Override
	public void delete() {
		System.out.println("Deleting Foochild Record.");
	}

}
