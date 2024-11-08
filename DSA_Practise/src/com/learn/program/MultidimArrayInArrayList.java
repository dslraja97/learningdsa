package com.learn.program;

import java.util.ArrayList;
import java.util.Scanner;

public class MultidimArrayInArrayList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> mDimList = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < 2; i++) {
			mDimList.add(new ArrayList<Integer>());
		}
		System.out.println("Enter the Numbers:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				mDimList.get(i).add(in.nextInt());
			}
		}

		System.out.println(mDimList);
	}

}
