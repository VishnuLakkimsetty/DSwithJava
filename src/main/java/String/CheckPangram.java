// https://www.geeksforgeeks.org/pangram-checking/

/*
 * Solution approach is to create a boolean array of size 26 (as we have 26 alphabets)
 * 
 * Now loop around the given string and for all occurrences of the alphabet replace that index 
 * value to true. else false. If the boolean array has any entry with false then given string 
 * is not a pangram
 * 
 * Time Complexity = O(n)
 * Space Complexity = O(1)
 */

package main.java.String;

public class CheckPangram {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog"; 

		if (isStringPangram(str) == true) 
			System.out.print(str + " is a pangram."); 
		else
			System.out.print(str+ " is not a pangram."); 

	}

	public static boolean isStringPangram(String str) {
		boolean b[] = new boolean[26];
		int index = -1;
		for(int i=0; i<str.length();i++) {
			// Check for upper case alphabets
			if('A'<= str.charAt(i)&& str.charAt(i)<='Z') {
				index = str.charAt(i)-'A';
			}
			// Check for lower case alphabets
			else if('a'<= str.charAt(i)&& str.charAt(i)<='z') {
				index = str.charAt(i)-'a';
			}

			b[index]=true;
		}

		for(int i=0;i<b.length;i++) {
			if(b[i]==false)
				return false;
		}
		return true;

	}

}
