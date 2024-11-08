package com.learn.program;

import java.util.Scanner;

public class learn2dArray {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		String[][] familyMatrix = new String[3][3];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = in.nextInt();
			}
		}
		System.out.println("Entered matrix:");
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter the family name:");
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				familyMatrix[row][col] = in.next();
			}
		}
		System.out.println("Entered the family members are:");
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(familyMatrix[row][col] + " ");
			}
			System.out.println();
		}

	}

}
