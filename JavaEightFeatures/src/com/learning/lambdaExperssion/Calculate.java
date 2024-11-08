package com.learning.lambdaExperssion;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter 2 number :");
		num1 = input.nextInt();
		num2 = input.nextInt();
		Operation operation = (a, b) -> System.out.println("Sum:" + (a + b));
		operation.sum(num1, num2);
		Arithematic arithematic = (a, b) -> {
			return (a - b);
		};

		Arithematic.exampleStatic();
		System.out.println(arithematic.subract(num1, num2));
		System.out.println("Default :" + arithematic.addition(num1, num2));
		;
	}

}
