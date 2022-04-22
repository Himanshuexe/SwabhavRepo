package com.monocept.product.factory;

public class AudiFactory implements IAutoFactory {
	
	private AudiFactory() {
	}

	@Override
	public IAuto make() {
		IAuto auto = new Audi();
		return auto;
	}

	public static IAutoFactory getInstance() {
		IAutoFactory factory = new AudiFactory();
		return factory;
	}

}
