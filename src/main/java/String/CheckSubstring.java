// https://www.geeksforgeeks.org/check-string-substring-another/

/*
 * This is the internal implementation of indexOf() method of String class.
 * 
 * Solution Approach:
 * ********************
 *  one by one check every index of s1. For every index, check if s2 is present.
 */

package main.java.String;

public class CheckSubstring {
	public static void main(String[] args) {
		String s1 = "vishnu";
		String s2 = "sh";
		System.out.println(s1.indexOf(s2));
		System.out.println(isSubString(s1,s2));
	}

	static int isSubString(String s1, String s2) {
		int M = s1.length();
		int N = s2.length();
		
		for(int i=0;i<=M-N;i++) {
			int j;
			for(j=0;j<N;j++) {
				if(s1.charAt(i+j)!=s2.charAt(j)) {
					break;
				}
			}
			
			if(j==N)
				return i;
		}
		return -1;
	}
}
