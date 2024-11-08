package com.learning.orderAgnostic;

public class DescAscBinarySearch {

	public static void main(String[] args) {
		int[] numsDesc = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] numsAsc = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 2;
		System.out.println(orderAgnosticBS(numsAsc, target));
		System.out.println(orderAgnosticBS(numsDesc, target));
	}

	private static int orderAgnosticBS(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		boolean isAsc = nums[start] < nums[end];
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
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
		return 0;
	}

}
