package com.learning.lambdaExperssion.functionalInterface;

import java.util.Arrays;
import java.util.List;

public class LearningConsumer {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 10, 2, 4, 5, 6, 7, 8, 9, 11);
		System.out.println("Before Sort");
		numbers.stream().distinct().filter(num -> num % 2 == 0).sorted((ele1, ele2) -> 1).forEach(System.out::println);

		// System.out.println("After Sort");
		// List<String> myList = Arrays.asList("one", "two", "three", "four", "five");
		//
		// // Using a parallel stream
		// System.out.println("Lenght :" + myList.parallelStream().filter(s -> s.length() >= 4).count());

	}
}
