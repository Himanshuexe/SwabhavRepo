package com.monocept.dip.solution;

public class TaxCalculator {
	private ILogger logType;

	public TaxCalculator(ILogger log) {
		this.logType = log;
	}

	public int calculateTax(int amount, int rate) {
		int result = 0;
		try {
			result = amount / rate;
		} catch (Exception e) {
			logType.log(e.getMessage());
		}
		return result;
	}
}
