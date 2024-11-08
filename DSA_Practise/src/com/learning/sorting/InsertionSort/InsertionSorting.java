package com.learning.sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 2, 1 };
		insertionSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void insertionSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (nums[j] < nums[j - 1]) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				} else {
					break;
				}
			}
		}
	}

}
