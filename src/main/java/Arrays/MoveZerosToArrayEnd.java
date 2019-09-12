//Given an array of random numbers, Push all the zero’s of a given array to the end of the array. 
//For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, 
//it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
//The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).

//https://www.geeksforgeeks.org/move-zeroes-end-array/

package main.java.Arrays;

public class MoveZerosToArrayEnd {

	public static void main(String[] args) {
		int[] ar = {1, 2, 0, 0, 0, 3, 6};
		
		System.out.print("Array before rearrangement is :: ");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		
		rearrangeArray(ar);
		
		System.out.print("Array after rearrangement is :: ");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
	}

	private static void rearrangeArray(int[] ar) {
		for(int i=ar.length-1;i>=0;i--) {
			if(ar[i]==0) {
				shiftZeroToEnd(ar,i);
			}
		}
	}

	private static void shiftZeroToEnd(int[] ar, int position) {
		int i;
		int n = ar.length-1;
		for(i=position;i<n;i++) {
			ar[i]=ar[i+1];
		}
		ar[i]=0;
	}
}
