package com.isp;

public class Airtel implements Internet {

	public Airtel() {
		super();
		System.out.println("Airtel :: Constructor");
	}

	@Override
	public void connection() {
		System.out.println("Airtel Broadbond");
	}

}
