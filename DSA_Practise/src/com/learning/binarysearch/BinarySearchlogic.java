package com.learning.binarysearch;

public class BinarySearchlogic {

	public static void main(String[] args) {

		int[] numsAsc = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] numsDesc = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int target = 2;

		System.out.println(binarySearch(numsAsc, target));
		System.out.println(binarySearch(numsDesc, target));
	}

	private static int binarySearch(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		boolean isAsc = nums[start] < nums[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == nums[mid]) {
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
		return -1;
	}

}
