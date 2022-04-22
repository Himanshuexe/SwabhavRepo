package com.monocept.model;

public class Boy implements IMannerable, IEmotionable {

	@Override
	public void cry() {
		System.out.println("Boy cried");
	}

	@Override
	public void laugh() {
		System.out.println("Boy laughed");
	}

	@Override
	public void wish() {
		System.out.println("Boy wished Hello");
	}

	@Override
	public void depart() {
		System.out.println("Boy departed Goodbye");
	}

}
