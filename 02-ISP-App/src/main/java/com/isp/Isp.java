package com.isp;

public class Isp {

	private Internet internet;

	public void setInternet(Internet internet) {
		this.internet = internet;
	}

	public Isp(Internet internet) {
		this.internet = internet;
	}

	public void getConnection() {
		internet.connection();
		System.out.println("My singal is Up!");
	}

	public void stop() throws Exception {
		System.out.println("Connection Closed!");
	}

	public void start() throws Exception {
		System.out.println("Connection Established Succesfully!");
	}

}
