package com.monocept.model;

public class Developer extends Employee {
	private double pib = basic * 0.4;
	private double otb = basic * 0.3;

	public Developer(int eNo, String eName, double basic) {
		super(eNo, eName, basic);
	}

	public double getPib() {
		return pib * 12;
	}

	public double getOtb() {
		return otb * 12;
	}

	@Override
	public double calcAnnaulCTC() {
		return 12 * (basic + pib + otb);
	}

	@Override
	public String salaryBreakup() {
		return "Pib: " + getPib() + " Otb: " + getOtb();
	}

	@Override
	public String getPosition() {
		return "Developer";
	}

}
