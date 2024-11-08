package com.learn.program;

public class FindEvenNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { -122, 123, 34562, 23456, 23452, 3, 2345 };
		int noOFEven = findEven1(numbers);
		int even = findEven2(numbers);

		System.out.println(noOFEven);
		System.out.println(even);
		System.out.println(findDigits(122));
	}

	private static int findEven2(int[] numbers) {
		int count = 0;
		for (int i : numbers) {
			if (Integer.toString(i).length() % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	private static int findEven1(int[] numbers) {
		int count = 0;
		for (int i : numbers) {
			if (even(i)) {
				count++;
			}
		}
		return count;
	}

	private static boolean even(int i) {
		int digits = findDigits(i);
		return digits % 2 == 0;

	}

	private static int findDigits(int i) {
		int digit = 0;
		while (i > 0) {
			digit++;
			i /= 10;
		}
		return digit;
	}

}
