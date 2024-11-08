package com.learn.program;

import java.util.ArrayList;

public class SumOfArrays {

	public static void main(String[] args) {
		int[] nums = { 10, 11, 1, 2, 4, 4, 6, 9, 2 };
		int target = 9;

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// for (int i = 0; i < nums.length - 1; i++) {
		// if (target == nums[i])
		// System.out.println(i);
		// }
		int i = 0;
		while (i <= nums.length - 1) {
			if (target == nums[i]) {
				System.out.println(i);
				break;
			} else {
				System.out.println(String.valueOf(-1));
			}
			i++;

		}
		// System.out.println("Numbers: " + numbers);
		//
		// System.out.println("Numbers: " + numbers);
		// System.out.println(Arrays.toString(linearSearch(nums, target)));
	}

	private static int[] linearSearch(int[] nums, int target) {
		int[] result = { -1, -1 };
		int temp = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums.length - 1 == i) {
				return result;
			} else {
				temp = i + 1;
			}
			if (target == nums[i] + nums[temp]) {
				return new int[] { i, temp };
			}
		}
		return result;
	}

}
