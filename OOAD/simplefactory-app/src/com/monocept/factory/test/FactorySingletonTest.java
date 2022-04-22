package com.monocept.factory.test;

import com.monocept.factory.AutoType;
import com.monocept.factory.AutomobileFactory;
import com.monocept.factory.IAutoMobile;

public class FactorySingletonTest {
	public static void main(String[] args) {
		AutomobileFactory factory = AutomobileFactory.getInstance();
		IAutoMobile product1 = factory.make(AutoType.Tesla);
		product1.start();
		product1.stop();
		
		IAutoMobile product2 = factory.make(AutoType.Bmw);
		product2.start();
		product2.stop();
	}

}
