package com.monocept.facade;

public class OrderDb implements IDataAccessible {

	@Override
	public void create() {
		System.out.println("Creating Order Record.");
	}
}
