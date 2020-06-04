package com.capgemini.practice;

import java.util.Arrays;

public class SecondSmallest {
	public static void main(String[] args) {

		int num[] = { 1, 9, 5, 2, 8, 5, 3, 55 };

		int n = num.length;

		Arrays.sort(num);

		System.out.println("Second smallest Number: " + num[1]);

	}

}
