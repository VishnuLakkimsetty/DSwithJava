//Given an array of random numbers, Push all the zero’s of a given array to the end of the array. 
//For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, 
//it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
//The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).

//https://www.geeksforgeeks.org/move-zeroes-end-array/

// In this method we will move the non-zero elements to left replacing zeros by doing a complete traversal
//And the remaining positions at the end is replaced with zeros

package main.java.Arrays;

public class MoveZeroesToArrayEndMethod2 {
	public static void main(String[] args) {
		int[] ar = {1, 2, 0, 0, 0, 3, 6};
		
		System.out.print("Array before rearrangement is :: ");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		
		rearrangeArrayM2(ar);
		
		System.out.print("Array after rearrangement is :: ");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
	}

	private static void rearrangeArrayM2(int[] ar) {
		int count = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0) {
				ar[count]=ar[i];
				count++;
			}
		}
		while(count<ar.length) {
			ar[count]=0;
			count++;
		}
	}
	
	
}
