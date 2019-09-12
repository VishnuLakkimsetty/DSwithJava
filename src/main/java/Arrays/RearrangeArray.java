//Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array.
//If element is not present then there will be -1 present in the array. 
//Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.

//https://www.geeksforgeeks.org/rearrange-array-arri/

package main.java.Arrays;

import java.util.Arrays;

public class RearrangeArray {

	public static void main(String[] args) {
		
		 int[] ar = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		 Arrays.sort(ar);
		 System.out.println("Sorted Array is :: ");
		 for(int i=0;i<ar.length;i++) {
			 System.out.println(ar[i]);
		 }
		 
	}
}
