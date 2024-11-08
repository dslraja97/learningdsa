package com.learn.program;

import java.util.Arrays;

public class SearchInMatrixLinearSearch {

	public static void main(String[] args) {
		int[][] numsMatrix = { { 1, 2, 3, 5 }, { 10, 4, 5, 6 }, { 11, 9, 7, 0 } };
		int target = 0;
		System.out.println(Arrays.toString(findTarget(numsMatrix, target)));
	}

	private static int[] findTarget(int[][] numsMatrix, int target) {
		int[] result = { -1, -1 };
		for (int i = 0; i < numsMatrix.length; i++) {
			for (int j = 0; j < numsMatrix[i].length; j++) {
				if (target == numsMatrix[i][j]) {// 00,
					result[0] = i;
					result[1] = j;

					return result;
				}
			}
		}
		return result;
	}

}
