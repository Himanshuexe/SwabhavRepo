package com.monocept.ocp.violation;

public class FixedDeposit {
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;
	Float rate;

	public FixedDeposit(String name, double principal, int duration, FestivalType festival) {
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

	public FestivalType getFestival() {
		return festival;
	}

	public float calculateRate() {
		if (festival == FestivalType.NORMAL)
			return 7f;
		if (festival == FestivalType.NEW_YEAR)
			return 8f;
		return 9f;

	}

	public double calculateSimpleInterest() {
		return (principal * calculateRate() / 100) * duration;
	}
}
