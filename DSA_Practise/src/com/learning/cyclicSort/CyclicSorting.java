package com.learning.cyclicSort;

import java.util.Arrays;

public class CyclicSorting {

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 2, 1 };
		cyclicSorting(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void cyclicSorting(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correctIndex = nums[i] - 1;
			if (nums[i] != nums[correctIndex]) {
				int temp = nums[correctIndex];
				nums[correctIndex] = nums[i];
				nums[i] = temp;
			} else {
				i++;
			}
		}
	}

}
