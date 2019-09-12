//Given an array (or string), the task is to reverse the array/string.

//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

package main.java.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6};
		System.out.print("Array before reversal is :: ");
		for(int i=0;i<ar.length;i++) {
			 System.out.print(ar[i] + " ");
		 }
		System.out.println();
		reverseArray(ar);
		System.out.print("Array after reversal is :: ");
		for(int i=0;i<ar.length;i++) {
			 System.out.print(ar[i] + " ");
		 }
	}

	private static void reverseArray(int[] ar) {
		int start = 0;
		int end = ar.length-1;
		while(start<end) {
			int temp = ar[start];
			ar[start]=ar[end];
			ar[end]=temp;
			start++;
			end--;
		}
	}
}
