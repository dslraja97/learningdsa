package com.learn.program;

import java.util.Scanner;

public class LinearSearchInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 5, 6, 21, 80, 2 };
		Scanner in = new Scanner(System.in);
		System.out.print("enter the number to search:");
		int search = in.nextInt();
		System.out.println(isPresentUsingFor(nums, search));
		System.out.println("Index value :" + isPresentUsingWhile(nums, search));

	}

	private static int isPresentUsingWhile(int[] nums, int search) {
		int start = 0;
		while (start < nums.length - 1) {
			if (search == nums[start]) {
				return search;
			}
			search++;
		}
		return -1;
	}

	private static boolean isPresentUsingFor(int[] nums, int search) {

		for (int i = 0; i < nums.length - 1; i++) {
			if (search == nums[i]) {
				return true;
			}
		}
		return false;
	}

}
