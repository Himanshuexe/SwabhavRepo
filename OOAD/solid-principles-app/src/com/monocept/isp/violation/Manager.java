package com.monocept.isp.violation;

public class Manager implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Manager started working.");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager stopped working.");
	}

	@Override
	public void startEat() {
		System.out.println("Manager started eating.");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager stopped eating.");
	}

}
