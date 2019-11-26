// Write a code to print the distinct count of characters in a given string

/*
 * For suppose if we have a string s = "ababacd" then our output should be a3b2c1d1
 * 
 * 
 * Solution Approach:
 * 
 * Create an int array of size 26 where each element represents an alphabet in order (array values are defaulted to zero)
 * 
 * Now loop around the characters in the given string and if an character present in the string increment the corresponding
 * index value by 1
 * 
 * Now you will have the array with count of elements. Print them if the count is non zero
 */

package main.java.String;

public class CharacterCount {

	public static void main(String[] args) {

		String str = "ababacd";
		printCharacterCount(str);
	}

	public static void printCharacterCount(String str) {
		int[] arr = new int[26];
		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				arr[str.charAt(i) - 'A'] += 1;
			} else if ('a' <= str.charAt(i) || str.charAt(i) <= 'z') {
				arr[str.charAt(i) - 'a'] += 1;
			}
		}

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] != 0)
			System.out.print((char) (x + 'a') + "" + arr[x]);
		}
	}

}
