package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	/*
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	 */

	public static void main(String[] args) {
		int[] nums = { 2, 8, 3, 6, 7, 2 };
		int target = 9;
		// int[] result = twoSum(nums, target);
		int[] result = twoSum1(nums, target);
		System.out.println(Arrays.toString(result));

	}

	private static int[] twoSum1(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] ans = new int[2];

		for (int i = 0; i < nums.length; i++) {
			int need = target - nums[i];// i1->7,

			if (map.containsKey(need)) {
				ans[0] = map.get(need);
				ans[1] = i;
				break;
			}

			map.put(nums[i], i);
		}

		return ans;
	}

	private static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};

	}
}
