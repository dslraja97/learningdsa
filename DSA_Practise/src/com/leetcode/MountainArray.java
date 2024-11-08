package com.leetcode;

public class MountainArray {
	/*
	 * https://leetcode.com/problems/peak-index-in-a-mountain-array/description/ {010}
	 * 
	 */
	public static void main(String[] args) {
		int[] nums = { 0, 10, 5, 2 };
		System.out.println(peakIndexInMountainArray(nums));
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

}
