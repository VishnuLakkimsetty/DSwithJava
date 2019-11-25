// https://www.geeksforgeeks.org/quick-way-check-characters-string/

/*
 * Traverse the string from the start and at any point if you find different string than before return false 
 * 
 * Time Complexity = O(n)
 * Space Complexity = O(1)
 */

package main.java.String;

public class AllCharactersSame {
	public static void main(String[] args) {
		String s = "aaab"; 
		if (allCharactersSame(s)) 
	        System.out.println("Yes"); 
	    else
	        System.out.println("No"); 
	          
	}
	public static boolean allCharactersSame(String str) {
	
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i) != str.charAt(i-1)) {
				return false;
			}
		}
		return true;
	}

}
