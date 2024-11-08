package com.leetcode;

public class MaxWealth {

	public static void main(String[] args) {
		int[][] wealth = { { 1, 2, 4 }, { 3, 2, 1 } };
		System.out.println(maxmiumWealth(wealth));
	}

	private static int maxmiumWealth(int[][] wealth) {
		int max = Integer.MIN_VALUE;
		for (int[] person : wealth) {// customer or row
			int sum = 0;
			for (int bank : person) {// bank or col
				sum += bank;
			}
			if (sum > max) {
				max = sum;
			}
		}
		return max;

	}

}
