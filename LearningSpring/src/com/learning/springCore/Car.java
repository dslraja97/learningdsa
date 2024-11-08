package com.learning.springCore;

public class Car {
	private Iengine iengine;

	// setter Based Dependency Inhection

	// public void setEngine(Iengine iengine) {
	// this.iengine = iengine;
	// }
	//
	// // Constructor based Dependency Injection
	// public Car(Iengine iengine) {
	// this.iengine = iengine;
	// }

	public void drive() {
		iengine.engine();
		System.out.println("Car Started");
	}

}
