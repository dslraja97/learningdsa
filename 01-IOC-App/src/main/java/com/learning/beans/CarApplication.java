package com.learning.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApplication {

	public static void main(String[] args) {
		ApplicationContext appletContext = new ClassPathXmlApplicationContext("Beans.xml");
		Car car = appletContext.getBean(Car.class);
		car.run();
	}

}
