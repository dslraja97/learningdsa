package com.learn.program;

import java.util.Arrays;

public class ArrayReversing {

	public static void main(String[] args) {
		int[] nums = { -1, -2, 5, 10, -34, -102 };
		System.out.println(Arrays.toString(nums));
		reverse(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void reverse(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			swap(nums, start, end);
			start++;
			end--;
		}
	}

	private static void swap(int[] nums, int start, int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}

}
