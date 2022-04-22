package com.monocept.product.factory;

public class TeslaFactory implements IAutoFactory {
	
	private TeslaFactory() {
	}

	@Override
	public IAuto make() {
		IAuto auto = new Tesla();
		return auto;
	}

	public static IAutoFactory getInstance() {
		IAutoFactory factory = new TeslaFactory();
		return factory;
	}

}
