package com.learn.methods;

public class LearningFunctions {
	public static void main(String[] args) {

		System.out.println(addition(10, 20));
		swap(10, 20);

	}

	private static void swap(int i, int j) {
		System.out.println("Before Swapped :" + i + "->" + j);
		int temp = i;
		i = j;
		j = temp;
		System.out.println(i + "<-" + j);
	}

	private static int addition(int n1, int n2) {

		return (n1 + n2);
	}

}
