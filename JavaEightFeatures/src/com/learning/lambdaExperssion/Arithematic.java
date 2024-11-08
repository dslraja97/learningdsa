package com.learning.lambdaExperssion;

@FunctionalInterface
public interface Arithematic {
	public int subract(int a, int b);

	public static void main(String[] args) {
		System.out.println("Hello world!");
	}

	public static void exampleStatic() {
		System.out.println("Interface Static Methoud");
	}

	default int addition(int a, int b) {
		return a + b;
	}

}
