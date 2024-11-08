package com.learn.program;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = in.nextInt();
		System.out.println(isArmstrong(n));
	}

	private static boolean isArmstrong(int n) {
		int original = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			sum = sum + rem * rem * rem;
		}
		if (original == sum)
			return true;
		else
			return false;
	}

}
