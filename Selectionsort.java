package com.capgemini.practice;

import java.util.Scanner;

public class Selectionsort {
	public static void Sort(int a[]) {
		int n = a.length, i, j, p, temp;
		for (i = 0; i < n - 1; i++) {
			p = i;
			for (j = i + 1; j < n; j++) {
				if (a[p] > a[j])
					p = j;

			}
			temp = a[p];
			a[p] = a[i];
			a[i] = temp;

		}
	}

	public static void printarray(int a[]) {
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

	}

	public static void main(String[] args) {
		int n, res, i;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " elements ");
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("elements in array ");
		printarray(a);
		Sort(a);
		System.out.println("\nelements after sorting");
		printarray(a);

	}

}