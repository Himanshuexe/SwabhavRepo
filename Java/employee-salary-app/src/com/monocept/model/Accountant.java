package com.monocept.model;

public class Accountant extends Employee {
	private double perks = basic * 0.3;

	public Accountant(int eNo, String eName, double basic) {
		super(eNo, eName, basic);
	}

	public double getPerks() {
		return perks * 12;
	}

	@Override
	public double calcAnnaulCTC() {
		return 12 * (basic + perks);
	}

	@Override
	public String salaryBreakup() {
		return "Perks: " + getPerks();
	}

	@Override
	public String getPosition() {
		return "Accountant";
	}

}
