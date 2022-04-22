package com.monocept.model;

public class AddOperation implements IMathOperation {

	@Override
	public long doOperation(int a, int b) {
		return a + b;
	}
}
