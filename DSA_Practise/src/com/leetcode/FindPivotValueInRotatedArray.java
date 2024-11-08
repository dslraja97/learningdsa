package com.leetcode;

public class FindPivotValueInRotatedArray {
	/*
	 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
	 */

	public static void main(String[] args) {
		// int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int[] nums = { 3, 5, 1 };// {1,3,5}-->1{5,1,3}-->2{3,5,1}

		// {1,2,3,4,5,6,7}
		int target = 2;

		System.out.println(find(nums, target));
		System.out.println(findMiddle(nums));
	}

	private static int find(int[] nums, int target) {
		int middle = findMiddle(nums);
		if (middle == -1) {
			return binarySearch(nums, target, 0, nums.length - 1);
		}
		if (target == nums[middle]) {// case 1 happy path
			return middle;
		}
		if (target >= nums[0]) {// case 2 : {4, 5, 6, 7(M), 0, 1, 2} target=6
			return binarySearch(nums, target, 0, middle - 1);
		}
		if (target < nums[0]) {// case 3 : {4, 5, 6, 7(M), 0, 1, 2} target=2
			return binarySearch(nums, target, middle + 1, nums.length - 1);
		}
		return -1;
	}

	private static int binarySearch(int[] nums, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target > nums[mid]) {
				start = mid + 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	private static int findMiddle(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && nums[mid] > nums[mid + 1]) {// case 1
				return mid;
			}
			if (mid > start && nums[mid] < nums[mid - 1]) {// case 2
				return mid - 1;
			}
			if (nums[mid] <= nums[start]) {// case 3:{ 4, 5, 6, 3, 2, 1, 0 }
				end = mid - 1;
			} else {// case 4
				start = mid + 1;
			}
		}
		return -1;
	}

}
