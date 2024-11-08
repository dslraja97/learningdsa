package com.learning.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int[] nums = { 2, 1, 1, 0, 0, 3, 4, 5, 6, 6 };
		bubbleSortAsc(nums);
		System.out.println("After Ascending Order :" + Arrays.toString(nums));
		bubbleSortDsc(nums);
		System.out.println("After Descending Order :" + Arrays.toString(nums));
	}

	private static void bubbleSortDsc(int[] nums) {
		boolean isSwapped;
		for (int i = 0; i < nums.length - 1; i++) {
			isSwapped = false;
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] < nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped) {
				break;
			}
		}
	}

	private static void bubbleSortAsc(int[] nums) {
		boolean swap;
		for (int i = 0; i < nums.length - 1; i++) {
			swap = false;
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {// comparing previous element i to present element
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					swap = true;
				}
			}
			if (!swap) {
				break;
			}
		}
	}
}
