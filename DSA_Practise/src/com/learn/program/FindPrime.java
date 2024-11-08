package com.learn.program;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an number to find prime:");
		int num = in.nextInt();
		System.out.println(isPrime(num));
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if (num < 1) {
			return false;
		}
		int n = 2;
		while (n * n <= num) {
			if (num % n == 0) {
				return false;
			}
			n++;
		}
		return n * n > num;

	}

}
