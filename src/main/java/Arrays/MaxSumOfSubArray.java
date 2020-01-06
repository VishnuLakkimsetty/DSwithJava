// https://www.geeksforgeeks.org/window-sliding-technique/

/*
 * Solution Approach:
 * ******************
 * 1st Approach - Brute Force
 * ---------------------------
 * 
 * Write 2 loops and outer loop runs till n-k+1 times and inner loop runs k times
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * 
 * 2nd Approach - Window Sliding technique
 * ----------------------------------------
 * Use window sliding technique
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package main.java.Arrays;

public class MaxSumOfSubArray {
	public static void main(String[] args) {
		int[] arr = {100, 200, 300, 400};
		int k =2;
		System.out.println(maxSum(arr, k));
		System.out.println(maxSumWindowSlide(arr,k));
	}

	private static int maxSum(int[] arr, int k) {
		int max_sum = 0;
		if(k>arr.length)
			return -1;
		
		for(int i=0;i<arr.length-k+1;i++) {
			int sum = 0;
			for(int j=0;j<k;j++) {
				sum+=arr[i+j];
			}
			if(sum>max_sum) {
				max_sum = sum;
			}
		}
		return max_sum;
	}
	
	private static int maxSumWindowSlide(int[] arr, int k) {
		int max_sum = 0;
		if(k>arr.length)
			return -1;
		
		for(int i=0;i<k;i++) {
			max_sum+=arr[i];
		}
		
		int sum = max_sum;
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i]-arr[i-k];
			if(sum>max_sum)
				max_sum = sum;
		}
		
		return max_sum;
	}
}
