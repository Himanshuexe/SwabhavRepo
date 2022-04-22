package com.monocept.isp.solution;

public class Robot implements IWorkerWork {

	@Override
	public void startWork() {
		System.out.println("Robot started working.");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stopped working.");
	}
}
