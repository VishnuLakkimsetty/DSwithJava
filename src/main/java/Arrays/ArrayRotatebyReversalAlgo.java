//Use Reversal algorithm to rotate an array

//https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/

package main.java.Arrays;

import java.util.Scanner;

public class ArrayRotatebyReversalAlgo {
	public static void main(String[] args) {

		// Asking user for size of array
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
		
		// Rotating Array by reversal Algorithm
		reverseArray(ar,0,d-1);
		reverseArray(ar,d,n-1);
		reverseArray(ar,0,n-1);
		
		System.out.println("Rotated Array by reversal Algorithm is ::");
		for (int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
	}

	private static void reverseArray(int[] ar, int start, int end) {
		
		int temp;
//		for(int i=start;i<end;i++) {
			while(start<end) {
				temp = ar[start];
				ar[start]=ar[end];
				ar[end]=temp;
				start++;
				end--;
			}
//		}
		
	}
}
