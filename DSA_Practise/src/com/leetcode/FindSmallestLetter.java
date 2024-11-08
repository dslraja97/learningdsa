package com.leetcode;

public class FindSmallestLetter {
	// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
	public static void main(String[] args) {
		char[] letters = { 'c', 'f', 'j' };
		char target = 'c';
		System.out.println(nextGreatestLetter(letters, target));
	}

	private static char nextGreatestLetter(char[] letters, int target) {
		int start = 0;
		int end = letters.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < letters[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return letters[start % letters.length];
	}

}
