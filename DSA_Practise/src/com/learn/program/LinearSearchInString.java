package com.learn.program;

import java.util.Scanner;

public class LinearSearchInString {

	public static void main(String[] args) {
		String name = "MokshithKrihsna";
		Scanner in = new Scanner(System.in);
		char search = 'K';
		System.out.println(linearSearchString(name, search) == true ? "present" : "Not Present");
	}

	private static boolean linearSearchString(String names, char search) {
		for (char c : names.toCharArray()) {
			if (search == c) {
				return true;
			}
		}
		return false;

	}

}
