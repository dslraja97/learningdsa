package com.learn.program;

import java.util.Arrays;

public class SwappingInArrays {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(nums));
		swap(nums, 0, 6);
		System.out.println(Arrays.toString(nums));
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
