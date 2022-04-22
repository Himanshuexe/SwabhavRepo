package com.monocept.facade;

public class CustomerDb implements IDataAccessible {

	@Override
	public void create() {
		System.out.println("Creating Customer Record.");
	}
}
