package com.leetcode;

public class SplitArrayLargeSum {
	/*
	 * https://leetcode.com/problems/split-array-largest-sum/description/
	 */
	public static void main(String[] args) {
		int[] nums = { 7, 2, 5, 10, 8 };
		int k = 2;
		System.out.println(splitArray(nums, k));
	}

	private static int splitArray(int[] nums, int k) {
		int start = 0;
		int end = 0;
		for (int i = 0; i < nums.length; i++) {
			start = Math.max(start, nums[i]);// this will contain the max element in the given array.
			end = end + nums[i];// sum of all the elements in the given array.
		}

		// binary search
		while (start < end) {
			// find the middle as our imaginary answer.
			int mid = start + (end - start) / 2;
			// for calculate the pieces u can divide this with the current mid (i.e our imagenary max value).
			int sum = 0;
			int piece = 1;
			for (int n : nums) {
				if (sum + n > mid) {
					// you cant add that in the subArray need to add that in the new array.
					sum = n;// lastly added value sum
					piece++;// this will act as new subarray.
				} else {
					sum += n;
				}
			}
			if (piece > k) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}

		return end;// we can return both the start as well as end bcoz both are same at one point of time
	}

}
