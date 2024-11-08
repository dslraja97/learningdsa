package com.learn.methods;

public class LearningShadowing {
	static int age = 27;

	public static void main(String[] args) {
		System.out.println(age);
		int age;
		age = 26;
		System.out.println(age);

		display();
	}

	private static void display() {
		System.out.println(age);
		age = 20;
		System.out.println(age);
	}

}
