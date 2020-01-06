// https://medium.com/@srajaninnov/find-a-subarray-with-a-given-sum-ccc42a70daa4

/*
 * Solution Approach
 * *****************
 * 
 * Use window sliding technique to do this.
 */

package main.java.Arrays;

public class SubArrayWithGivenSum {
	public static void main(String[] args) {
		int[] arr = { 100, 200, 300, 400 };
		int k = 700;
		int k1 = 78;
		int[] res = getIndices(arr, k);
		for (int i : res)
			System.out.print(i + " ");
		int[] res1 = getIndices(arr, k1);
		for (int i : res1)
			System.out.print(i + " ");
	}

	private static int[] getIndices(int[] arr, int sum) {
		int window_size = arr[0];
		int start = 0;
		if (window_size == sum) {
			return new int[] { 0 };
		}

		for (int i = 1; i < arr.length; i++) {
			while (window_size > sum && start < i - 1) {
				window_size -= arr[i];
				start++;
			}

			if (window_size == sum) {
				return new int[] { start + 1, i };
			}

			window_size += arr[i];

		}

		return new int[] { -1, -1 };
	}
}
