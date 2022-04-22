package com.monocept.factory.test;

import com.monocept.product.factory.*;

public class Test {
	public static void main(String[] args) {
		IAutoFactory factory;
//		factory = new BmwFactory();
		factory= new TeslaFactory();
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
	}
}
