package com.monocept.facade;

public class DepartmentDb implements IDataAccessible {

	@Override
	public void create() {
		System.out.println("Creating Department Record.");
	}

}
