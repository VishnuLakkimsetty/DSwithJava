// https://leetcode.com/problems/median-of-two-sorted-arrays/
package main.java.Arrays;

public class MedianOfTwoSortedArray {

	public static void main(String[] arhs) {
		int[] arr1 = { 1, 3 };
		int[] arr2 = { 2, 4 };
		System.out.println(findMedianSortedArrays(arr1, arr2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double[] nums = new double[nums1.length + nums2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] <= nums2[j]) {
				nums[k] = nums1[i];
				i++;
				k++;
			} else {
				nums[k] = nums2[j];
				j++;
				k++;
			}
		}

		for (; i < nums1.length; i++) {
			nums[k] = nums1[i];
			k++;
		}

		for (; j < nums2.length; j++) {
			nums[k] = nums2[j];
			k++;
		}

		int n = (int) Math.ceil(nums.length / 2);
		if (nums.length % 2 != 0) {
			Double d = Double.valueOf(nums[n]);
			return d;
		} else {
			Double d = Double.valueOf((nums[n] + nums[n - 1]) / 2);
			return d;
		}
	}

}
