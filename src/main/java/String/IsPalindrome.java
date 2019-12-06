// Check whether given string is palindrome or not

/*
 * Loop the around the half length of the String 
 * 
 * if the corresponding elements of first and last elements are equal, then continue loop else return false
 * 
 * if the loop is done, then return true
 * 
 * Time Complexity: O(N)
 */
package main.java.String;

public class IsPalindrome {
public static void main(String[] args) {
	String s = "racecar";
	String s1 = "thisisnotapalindrome";
	System.out.println(checkPalindrome(s));
	System.out.println(checkPalindrome(s1));
}

 static boolean checkPalindrome(String s) {
	for(int i=0;i<s.length()/2;i++) {
		if(s.charAt(i)==s.charAt(s.length()-i-1))
			continue;
		else
			return false;
	}
	return true;
}
}
