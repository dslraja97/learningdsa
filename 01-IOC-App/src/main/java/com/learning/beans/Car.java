package com.learning.beans;

public class Car {
	private Iengine iengine;

	public void setIengine(Iengine iengine) {
		this.iengine = iengine;
	}

	public void run() {
		iengine.start();
		System.out.println("Drive your car!");
	}
}
