package com.learn.program;

import java.util.Arrays;

public class MultidimensionaltoSingleArray {

	public static void main(String[] args) {
		int[][] nums = { { 1, 2 }, { 3, 4 } };
		int[] result = Arrays.stream(nums).flatMapToInt(Arrays::stream).toArray();
		System.out.println(Arrays.toString(result));
	}

}
