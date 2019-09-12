// Given a sorted and rotated array, find if there is a pair with a given sum

// https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/

package main.java.Arrays;

import java.util.Scanner;

public class SumPairInSortedArray {
	public static void main(String[] args) {
		ArrayRotate arrayrotate = new ArrayRotate();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array whose values will be defaulted with its size range :: ");

		int n = sc.nextInt();

		int[] ar = new int[n];

		for (int i=0;i<ar.length;i++) {
			ar[i] = i;
		}

		for (int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println("Enter the number by which the array to be rotated :: ");

		int d = sc.nextInt();
		sc.close();
		
		if(d>=ar.length) {
			throw new RuntimeException("The number by which the array to be rotated exceeds/equals array size");
		}
		
		// Using method in ArrayRotate.java file
		int[] rotatedArraybyLeft = arrayrotate.rotateArrayleft(ar, d, n);
		System.out.println("rotatedArray to left one by one");
		for (int i=0;i<n;i++) {
			System.out.print(rotatedArraybyLeft[i] + " ");
		}
		
		int sum = sc.nextInt();
		
		
	}
}
