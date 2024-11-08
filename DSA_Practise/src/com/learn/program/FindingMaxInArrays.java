package com.learn.program;

public class FindingMaxInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -1, -2, 5, 10, -34, -102 };
		System.out.println("Max Value: " + max(nums));
		System.out.println("Min Value: " + min(nums));

	}

	private static int min(int[] nums) {
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}

	private static int max(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

}
