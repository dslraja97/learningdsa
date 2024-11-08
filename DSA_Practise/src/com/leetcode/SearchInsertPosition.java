package com.leetcode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 3;
		System.out.println(searchInsert1(nums, target));
	}

	private static int searchInsert1(int[] nums, int target) {
		if (nums[nums.length - 1] < target) {
			return nums.length;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < target && nums[i + 1] > target) {
				return i + 1;
			}
		}
		return 0;
	}

}
