// https://www.geeksforgeeks.org/check-string-pangrammatic-lipogram/

/*
 * Solution approach is like below
 * 
 * Place all the characters(ignoring case) in a Tree set
 * 
 * So now tree set will have all the unique elements in sorted order.
 * 
 * If size of tree set is 26 then it is pangram
 * 
 * If size of tree set is 25 then it is Pangrammatic Lipogram
 * 
 * If size of tree set is <25 then it is Lipogram 
 * 
 * 
 * Time Complexity is O(N) where N is length of String
 * Space complexity is O(1)
 */

package main.java.String;

import java.util.Set;
import java.util.TreeSet;

public class PangrammaticLipogramUsingTreeSet {
	
	public static void main(String []args) 
	{ 
	    	      
	    String str = "The quick brown fox jum over the lazy dog"; 
	    System.out.println(panLipogramCheckerWithTreeSet(str)); 
	} 
	
	public static String panLipogramCheckerWithTreeSet(String str) {
		Set<Character> s = new TreeSet<>();
		for(int i=0;i<str.length();i++) {
			if('A'<=str.charAt(i)&&str.charAt(i)<='Z') {
				s.add(Character.toLowerCase(str.charAt(i))); // Converting the char to lower case and adding to tree set
			}else if('a'<=str.charAt(i)&&str.charAt(i)<='z') {
				s.add(str.charAt(i));;
			}
		}

		for(char ch : s) {
			System.out.println(ch + "");
		}
		
		if(s.size()==26)
			return "P";

		if(s.size()==25)
			return "PL";

		return "L";
	}

}
