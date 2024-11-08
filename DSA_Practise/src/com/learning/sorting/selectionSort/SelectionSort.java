package com.learning.sorting.selectionSort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] nums = { 5, 4, 3, 2, 1, 1, 2, 0, -1 };
		selectionSortingAsc(nums);
		System.out.println("Ascending Order: " + Arrays.toString(nums));
		selectionSortingDesc(nums);
		System.out.println("Descending Order : " + Arrays.toString(nums));
	}

	private static void selectionSortingDesc(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int last = nums.length - i - 1;
			int min = findMinimum(nums, 0, last);
			int temp = nums[min];
			nums[min] = nums[last];
			nums[last] = temp;
		}
	}

	private static int findMinimum(int[] nums, int start, int last) {
		int min = start;
		for (int i = start; i <= last; i++) {
			if (nums[min] > nums[i]) {
				min = i;
			}
		}
		return min;
	}

	private static void selectionSortingAsc(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int last = nums.length - i - 1;
			int maxIndex = findMax(nums, 0, last);
			int temp = nums[maxIndex];
			nums[maxIndex] = nums[last];
			nums[last] = temp;
		}
	}

	private static int findMax(int[] nums, int start, int last) {
		int max = start;
		for (int i = start; i <= last; i++) {
			if (nums[max] < nums[i]) {
				max = i;
			}
		}
		return max;
	}

}
