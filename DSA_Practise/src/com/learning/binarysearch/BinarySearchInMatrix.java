package com.learning.binarysearch;

import java.util.Arrays;

public class BinarySearchInMatrix {

	public static void main(String[] args) {
		int[][] numsMatrix = { { 10, 20, 30, 40 }, { 11, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 38, 50 } };
		int target = 25;
		System.out.println(Arrays.toString(searchInMatrix(numsMatrix, target)));
	}

	private static int[] searchInMatrix(int[][] numsMatrix, int target) {
		int start = 0;
		int end = numsMatrix.length - 1;
		while (start < numsMatrix.length && end >= 0) {
			if (numsMatrix[start][end] == target) {// happy path
				return new int[] { start, end };
			}
			if (numsMatrix[start][end] > target) {// [0,3]=40>target so need eliminate that column.
				end--;
			} else {// [0,2]=20<target we need to move the cursor to next row
				start++;
			}
		}
		return new int[] { -1, -1 };
	}

}
