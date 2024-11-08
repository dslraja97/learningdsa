package com.learn.Switch;

import java.util.Scanner;

public class LearningEnhanceSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter fruit:");
		String fruitName = input.next();
		switch (fruitName.toUpperCase()) {
		case "MANGO" -> System.out.println("Mango");
		case "BANANA" -> System.out.println("BANANA");
		case "APPLE" -> System.out.println("APPLE");
		case "JACK" -> System.out.println("JACK");
		case "GRAPE" -> System.out.println("GRAPE");
		case "GUAVA" -> System.out.println("GUAVA");
		case "WATERMELON" -> System.out.println("WATERMELON");
		default -> System.out.println("please enter valid fruit name");
		}
	}

}
