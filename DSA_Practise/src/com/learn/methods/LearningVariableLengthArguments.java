package com.learn.methods;

import java.util.Arrays;

public class LearningVariableLengthArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		call("Dinesh", 1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(fib(6));

	}

	public static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

	private static void call(String name, int... v) {
		System.out.println(Arrays.toString(v));
		System.out.println(name);
		// TODO Auto-generated method stub

	}

}
