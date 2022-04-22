package com.monocept.factory.test;

import com.monocept.product.factory.*;

public class Test2 {
	public static void main(String[] args) {
		IAutoFactory factory;
//		factory = BmwFactory.getInstance();
		factory= AudiFactory.getInstance();
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
	}
}