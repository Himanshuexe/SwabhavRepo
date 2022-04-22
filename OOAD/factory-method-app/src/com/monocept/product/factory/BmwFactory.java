package com.monocept.product.factory;

public class BmwFactory implements IAutoFactory {
	
//	private BmwFactory() {
//	}
	

	@Override
	public IAuto make() {
		IAuto auto = new Bmw();
		return auto;
	}


//	public static IAutoFactory getInstance() {
//		IAutoFactory factory = new BmwFactory();
//		return factory;
//	}

}
