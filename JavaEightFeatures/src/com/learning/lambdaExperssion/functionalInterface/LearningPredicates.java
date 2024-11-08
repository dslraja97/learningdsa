package com.learning.lambdaExperssion.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LearningPredicates {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Dinesh", "Harish", "Teja", "Kannan");

		Predicate<String> predicate = name -> name.length() >= 6;
		Predicate<String> predicate2 = name -> name.endsWith("h");
		System.out.println("And");
		check(predicate2.and(predicate), names);
		System.out.println("Or");
		check(predicate2.or(predicate), names);

	}

	private static void check(Predicate<String> predicate, List<String> names) {
		for (int i = 0; i < names.size(); i++) {
			if (predicate.test(names.get(i))) {
				System.out.println(names.get(i));
			}
		}

	}

}
