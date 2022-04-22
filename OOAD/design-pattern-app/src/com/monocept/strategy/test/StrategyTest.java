package com.monocept.strategy.test;

import com.monocept.strategy.AddOperation;
import com.monocept.strategy.MultiplyOperation;
import com.monocept.strategy.StrategyOperation;
import com.monocept.strategy.SubstractOperation;

public class StrategyTest {
	public static void main(String[] args) {
		StrategyOperation operation = new StrategyOperation(new AddOperation());
		System.out.println(operation.executeOperation(5, 4));

		StrategyOperation operation2 = new StrategyOperation(new SubstractOperation());
		System.out.println(operation2.executeOperation(5, 2));

		StrategyOperation operation3 = new StrategyOperation(new MultiplyOperation());
		System.out.println(operation3.executeOperation(2, 5));
	}
}
