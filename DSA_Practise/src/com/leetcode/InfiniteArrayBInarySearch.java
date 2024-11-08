package com.leetcode;

public class InfiniteArrayBInarySearch {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20 };
		int target = -12;
		System.out.println(findingRange(nums, target));
	}

	private static int findingRange(int[] nums, int target) {
		int start = 0;
		int end = 1;
		while (target > nums[end]) {
			int temp = end + 1;
			end = end + (end - start + 1) * 2;
			start = temp;
		}

		return binarySearch(nums, target, start, end);
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
}
