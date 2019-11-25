// https://www.geeksforgeeks.org/missing-characters-make-string-pangram/

/*
 * Solution approach is to create a boolean array of size 26 (as we have 26 alphabets)
 * 
 * Now loop around the given string and for all occurrences of the alphabet replace that index 
 * value to true. else false. If the boolean array has any entry with false then print the characters belongs to that index
 */

package main.java.String;

public class MakePangram {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy cat"; 

		changeStringToPangram(str);
	}

	public static void changeStringToPangram(String str) {
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
				System.out.print((char)(i+'A') + " or "+(char)(i+'a')+" ");
		}
	}
}
