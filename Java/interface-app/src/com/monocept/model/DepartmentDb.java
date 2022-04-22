package com.monocept.model;

public class DepartmentDb implements IDataAccessible {
	@Override
	public void read() {
		System.out.println("Reading Department Record.");
	}

	@Override
	public void create() {
		System.out.println("Creating Department Record.");
	}

	@Override
	public void update() {
		System.out.println("Updating Department Record.");
	}

	@Override
	public void delete() {
		System.out.println("Deleting Depatment Record.");
	}
}
