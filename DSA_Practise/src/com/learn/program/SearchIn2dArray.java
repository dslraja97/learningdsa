package com.learn.program;

import java.util.Scanner;

public class SearchIn2dArray {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		Scanner in = new Scanner(System.in);
		System.out.println("enter the Number: ");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = in.nextInt();
			}
		}
		System.out.println("entered Number are: ");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		System.out.print("enter the number to search: ");
		int search = in.nextInt();

		System.out.println(find(arr, search));
		System.out.println("Max : " + max(arr));
		System.out.println("Min : " + min(arr));
	}

	private static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int[] r : arr) {
			for (int c : r) {
				if (c > max) {
					max = c;
				}
			}
		}
		return max;
	}

	private static int min(int[][] arr) {
		int min = Integer.MAX_VALUE;
		for (int[] r : arr) {
			for (int c : r) {
				if (c < min) {
					min = c;
				}
			}
		}
		return min;
	}

	private static boolean find(int[][] arr, int search) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == search) {
					return true;
				}
			}
		}
		return false;
	}

}
