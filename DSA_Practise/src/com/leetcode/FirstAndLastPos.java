package com.leetcode;

import java.util.Arrays;

public class FirstAndLastPos {
	// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
	public static void main(String[] args) {
		int[] numsAsc = { 5, 7, 7, 7, 8, 8, 8, 8, 8, 10 };
		int[] numsDesc = { 10, 8, 8, 8, 8, 8, 7, 7, 7, 5 };
		int target = 8;
		System.out.println(Arrays.toString(searchRange(numsAsc, target)));
		System.out.println(Arrays.toString(searchRange(numsDesc, target)));
	}

	private static int[] searchRange(int[] nums, int target) {
		int[] ans = { -1, -1 };
		ans[0] = findIndex(nums, target, true, nums[0] < nums[nums.length - 1]);
		if (ans[0] != -1) {
			ans[1] = findIndex(nums, target, false, nums[0] < nums[nums.length - 1]);
		}

		return ans;
	}

	public static int findIndex(int[] nums, int target, boolean isStartIndex, boolean isAsc) {
		System.out.println(isAsc);
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (isAsc) {
				if (target > nums[mid]) {
					start = mid + 1;
				} else if (target < nums[mid]) {
					end = mid - 1;
				} else {
					ans = mid;
					if (isStartIndex == true) {
						end = mid - 1;
					} else {
						start = mid + 1;
					}
				}
			} else {
				if (target > nums[mid]) {
					end = mid - 1;
				} else if (target < nums[mid]) {
					start = mid + 1;
				} else {
					ans = mid;
					if (isStartIndex == true) {
						end = mid - 1;
					} else {
						start = mid + 1;
					}
				}

			}
		}
		return ans;
	}

}
