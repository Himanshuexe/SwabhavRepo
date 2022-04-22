package com.moncept.dip.violation;

public class TaxCalculator {
	private LogType loggerType;

	public TaxCalculator(LogType log) {
		this.loggerType = log;
	}

	public int calculateTax(int amount, int rate) {
		int result = 0;
		try {
			result = amount / rate;
		} catch (Exception e) {
			if (loggerType == LogType.DB) {
				DBLogger dbLogger = new DBLogger();
				dbLogger.log(e.getMessage());
			}
			if (loggerType == LogType.FILE) {
				FILELogger fileLogger = new FILELogger();
				fileLogger.log(e.getMessage());
			}
		}
		return result;
	}
}
