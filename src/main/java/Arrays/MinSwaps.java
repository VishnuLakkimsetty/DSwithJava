//Given an array of n positive integers and a number k. 
//Find the minimum number of swaps required to bring all the numbers less than or equal to k together.

//https://www.geeksforgeeks.org/minimum-swaps-required-bring-elements-less-equal-k-together/

// Code works only if elements are non-repetitive

package main.java.Arrays;

public class MinSwaps {
	public static void main(String[] args) {
		int[] ar = {2, 7, 9, 5, 8, 7, 4};
		System.out.print("Array before reversal is :: ");
		for(int i=0;i<ar.length;i++) {
			 System.out.print(ar[i] + " ");
		 }
		System.out.println();
		int n = 5;
		int swaps = minSwap(ar,n);
		System.out.print("Min swaps required is :: "+ swaps);
	}

	private static int minSwap(int[] a,int num) {
		
		int swaps = 0;
		int position;
		for (int i=0;i<a.length;i++) {
			if(a[i]==num) {
				position = i;
				break;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			
		}
		
		
		
		
		return swaps;
	}
}
