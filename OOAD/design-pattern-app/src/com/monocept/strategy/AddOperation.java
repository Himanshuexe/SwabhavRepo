package com.monocept.strategy;

public class AddOperation implements IMathOperation {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}

}
