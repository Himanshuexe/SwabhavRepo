package com.monocept.model;

public class CustomerDb implements IDataAccessible {

	@Override
	public void read() {
		System.out.println("Reading Customer Record.");
	}

	@Override
	public void create() {
		System.out.println("Creating Customer Record.");
	}

	@Override
	public void update() {
		System.out.println("Updating Customer Record.");
	}

	@Override
	public void delete() {
		System.out.println("Deleting Customer Record.");
	}

}
