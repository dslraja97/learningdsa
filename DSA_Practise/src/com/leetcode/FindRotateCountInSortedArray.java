package com.leetcode;

public class FindRotateCountInSortedArray {

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 3, 2, 1, 0 };
		System.out.println(findPivot(nums));
	}

	private static int findPivot(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && nums[mid] > nums[mid + 1]) {
				return mid + 1;
			}
			if (mid > start && nums[mid] < nums[mid - 1]) {
				return (mid - 1) + 1;
			}
			if (nums[mid] <= nums[start]) {// { 4, 5, 6, 3, 2, 1, 0 }
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
