package com.learning.springCore;

import java.lang.reflect.Field;

public class CarApplication {

	public static void main(String[] args) throws Exception {
		// Field Injection
		Class<?> clz = Class.forName("Car");
		Object obj = clz.getDeclaredConstructor().newInstance();
		Car car = (Car) obj;
		Field field = clz.getDeclaredField("iengine");
		field.setAccessible(true);
		field.set(car, new PetrolEngine());
		car.drive();
	}

}
