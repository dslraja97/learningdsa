package com.leetcode;

public class FindInMountainArray {
	/*
	 * https://leetcode.com/problems/find-in-mountain-array/description/
	 * 
	 */
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 3, 1 };
		int target = 3;
		System.out.println(search(nums, target));
	}

	private static int search(int[] nums, int target) {
		int high = peakIndexInMountainArray(nums);
		int search1 = binarySearch(nums, target, 0, high);
		if (search1 != -1) {
			return search1;
		}
		return binarySearch(nums, target, high + 1, nums.length - 1);
	}

	private static int peakIndexInMountainArray(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] > nums[mid + 1]) {
				end = mid;// in desending part of array
			} else {
				start = mid + 1;
			}
		}
		return end;
	}

	private static int binarySearch(int[] nums, int target, int start, int end) {
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
		return -1;
	}

}
