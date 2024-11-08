package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindMedianSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 3 };

		Set<Integer> nums = new HashSet<Integer>();
		for (int i : arr1) {
			nums.add(i);
		}
		for (int i : arr2) {
			nums.add(i);
		}
		System.out.println(nums);
	}
}
