package com.monocept.model;

public class Manager extends Employee {
	private double hra = basic * 0.5;
	private double da = basic * 0.2;
	private double ta = basic * 0.1;

	public Manager(int eNo, String eName, double basic) {
		super(eNo, eName, basic);
	}

	public double getHra() {
		return hra * 12;
	}

	public double getDa() {
		return da * 12;
	}

	public double getTa() {
		return ta * 12;
	}

	@Override
	public double calcAnnaulCTC() {
		return 12 * (basic + hra + da + ta);
	}

	@Override
	public String salaryBreakup() {
		return "Hra: " + getHra() + " Da: " + getDa() + " Ta: " + getTa();
	}

	@Override
	public String getPosition() {
		return "Manager";
	}

}
