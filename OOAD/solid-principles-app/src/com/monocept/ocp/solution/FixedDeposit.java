package com.monocept.ocp.solution;

public class FixedDeposit {
	private final String name;
	private final double principal;
	private final int duration;
	private final IFestivalRate festival;

	public FixedDeposit(String name, double principal, int duration, IFestivalRate festival) {
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getDuration() {
		return duration;
	}

	public String getFestival() {
		return festival.getClass().getSimpleName();
	}

	public float getRate() {
		return festival.calculateRate();
	}

	public double calculateSimpleInterest() {
		return (principal * getRate() / 100) * duration;
	}
}
