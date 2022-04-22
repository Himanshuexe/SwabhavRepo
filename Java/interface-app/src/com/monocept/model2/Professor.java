package com.monocept.model2;

public class Professor extends Person {
	private double basicSalary;
	private double bonus = basicSalary * 0.5;
	private double salary;

	public Professor(int id, String address, String dob, double basicSalary) {
		super(id, address, dob);
		this.basicSalary = basicSalary;
	}

	public double calculateSalary() {
		salary = basicSalary + basicSalary * 0.5;
		return salary;
	}

	public String details() {
		return "Salary: " + salary;
	}
}
