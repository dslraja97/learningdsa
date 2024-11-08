package com.leetcode;

public class CeilingOfNumber {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 5, 6, 8, 9, 10 };
		// int[] nums = { 10, 9, 8, 6, 5, 4, 2, 1 };
		int target = 3;// for ceiling of number need to return the bigger number than target && floor of number mean return lesser
						// than the target number need to return.
		// ceiling smallest number greater than or equal to target number
		System.out.println("Ceiling : " + findCeiling(nums, target));
		// floor greatest number less than or equal to target number
		System.out.println("Flooring : " + flooring(nums, target));
	}

	private static int findCeiling(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		// if (target > nums[nums.length - 1]) {
		// return -1;
		// }
		boolean isAsc = nums[start] < nums[end];
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return nums[mid];
			}
			if (isAsc) {
				if (target > nums[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (target > nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return nums[start];
	}

	private static int flooring(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		boolean isAsc = nums[start] < nums[end];
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return nums[mid];
			}
			if (isAsc) {
				if (target > nums[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (target > nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return nums[end];
	}

}
