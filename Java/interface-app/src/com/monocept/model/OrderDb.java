package com.monocept.model;

public class OrderDb implements IDataAccessible {

	@Override
	public void read() {
		System.out.println("Reading Order Record.");
	}

	@Override
	public void create() {
		System.out.println("Creating Order Record.");
	}

	@Override
	public void update() {
		System.out.println("Updating Order Record.");
	}

	@Override
	public void delete() {
		System.out.println("Deleting Order Record.");
	}
}
