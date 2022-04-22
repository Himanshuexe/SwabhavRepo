package com.monocept.factory;

public class AutomobileFactory {
	private static AutomobileFactory instance;

	private AutomobileFactory() {
	}

	public static AutomobileFactory getInstance() {
		if (instance == null) {
			instance = new AutomobileFactory();
		}
		return instance;
	}

	public IAutoMobile make(AutoType auto) {

		if (auto == AutoType.Audi)
			return new Audi();

		if (auto == AutoType.Bmw)
			return new Bmw();

		return new Tesla();
	}
}
