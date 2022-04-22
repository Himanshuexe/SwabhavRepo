package com.monocept.model;

public abstract class Employee {
	private int eNo;
	private String eName;
	protected double basic;

	public Employee(int eNo, String eName, double basic) {
		this.eNo = eNo;
		this.eName = eName;
		this.basic = basic;
	}

	public int getENo() {
		return eNo;
	}

	public String getEName() {
		return eName;
	}

	public double getBasic() {
		return basic;
	}

	public abstract double calcAnnaulCTC();

	public abstract String salaryBreakup();

	public abstract String getPosition();
}
