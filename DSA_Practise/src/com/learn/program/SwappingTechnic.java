package com.learn.program;

import java.util.Arrays;

public class SwappingTechnic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(Arrays.toString(swapWithoutTemp(nums, 1, 5)));
		// System.out.println(Arrays.toString(swapWithoutTemp(nums, 0, 9)));
	}

	private static int[] swapWithoutTemp(int[] nums, int i, int j) {
		nums[i] = nums[i] + nums[j];// 1+9=10
		nums[j] = nums[i] - nums[j];// 10-9=1
		nums[i] = nums[i] - nums[j];// 10-1=9
		return nums;
	}

	private static int[] swapUsingTemp(int[] numsAsc, int swap1, int swap2) {
		int temp = numsAsc[swap1];
		numsAsc[swap1] = numsAsc[swap2];
		numsAsc[swap2] = temp;
		return numsAsc;
	}

}
