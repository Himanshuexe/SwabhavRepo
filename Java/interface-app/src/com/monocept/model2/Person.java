package com.monocept.model2;

import java.text.SimpleDateFormat;

public abstract class Person {
	private int id;
	private String address;
	private String dob = "dd-mm-yyyy";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dob);

	Person(int id, String address, String dob) {
		this.id = id;
		this.address = address;
		this.dob = dob;
	}

	public abstract String details();
}
