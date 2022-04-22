package com.monocept.strategy;

public class StrategyOperation {
	private IMathOperation mathOperation;

	public StrategyOperation(IMathOperation mathOperation) {
		this.mathOperation = mathOperation;
	}

	public int executeOperation(int num1, int num2) {
		return mathOperation.doOperation(num1, num2);
	}
}
