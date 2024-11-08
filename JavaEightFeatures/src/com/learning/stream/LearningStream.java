package com.learning.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class LearningStream {

	public static void main(String[] args) {
		int[] numbers = { 20, 2, 3, 9, 11, 12, 10, 2, 3 };
		Arrays.stream(numbers)// intermediate Operator
				.distinct()// intermediate Operator
				.sorted()// intermediate Operator
				.forEach(System.out::println);// Terminal Operator

		// to find maxmium number from the arraylist.
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(10);
		integers.add(30);
		integers.add(20);
		integers.add(60);
		integers.add(50);
		integers.add(40);

		Optional<Integer> output = integers.stream().max((num1, num2) -> num1.compareTo(num2));
		System.out.println(output.get());
	}

}
