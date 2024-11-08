package com.learn.methods;

public class LearningScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 10;
		{
			a = 30;
			int c = b;
			System.out.println(c);
		}
		System.out.println(a);

	}

}
