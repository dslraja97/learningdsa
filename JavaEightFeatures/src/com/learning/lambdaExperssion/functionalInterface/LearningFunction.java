package com.learning.lambdaExperssion.functionalInterface;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class LearningFunction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		Function<String, Integer> function = string -> string.length();
		System.out.println("Please Enter any string to find the length:");
		Integer length = function.apply(name = input.next());
		System.out.println("Lenght : " + function.apply(name));
		Predicate<Integer> predicate = length1 -> length1 % 2 == 0;
		System.out.println(predicate.test(length));
	}

}
