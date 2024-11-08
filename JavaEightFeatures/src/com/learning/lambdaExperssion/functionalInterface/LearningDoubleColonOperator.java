package com.learning.lambdaExperssion.functionalInterface;

import java.util.ArrayList;
import java.util.List;

public class LearningDoubleColonOperator {
	public static void display(int input) {
		System.out.println("Inside Class :" + input);
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(50);
		numbers.add(40);
		numbers.forEach(System.out::println);
		LearningDoubleColonOperator colonOperator = new LearningDoubleColonOperator();
		Calculate calculate = LearningDoubleColonOperator::display;
		calculate.sum(100);
	}

}
