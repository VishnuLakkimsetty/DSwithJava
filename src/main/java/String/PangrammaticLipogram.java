// https://www.geeksforgeeks.org/check-string-pangrammatic-lipogram/

/*
 * Solution approach is like below
 * 
 * Create an int array of size 26 where each element represents an alphabet in order (array values are defaulted to zero)
 * 
 * Now loop around the characters in the given string and if an character present in the string mark the corresponding value to 1
 * 
 * Now you will have the array whose elements are 1 if you have the character else zero if you don't have the character in the given string
 * 
 * if you have no zeros it is Pangram
 * 
 * if you have one zero it is pangrammatic lipogram
 * 
 * if you have more than one zero lipogram
 * 
 * Time Complexity is O(N) where N is length of String
 * Space complexity is O(1)
 */

package main.java.String;

public class PangrammaticLipogram {

	public static void main(String []args) 
	{ 
	    	      
	    String str = "The quick brown fox jum over the lazy dog"; 
	    System.out.println(panLipogramChecker(str)); 
	} 
	
	public static String panLipogramChecker(String str) {
		int[] arr = new int[26];
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if('A'<=str.charAt(i)&&str.charAt(i)<='Z') {
				arr[str.charAt(i)-'A']=1;
			}else if('a'<=str.charAt(i)&&str.charAt(i)<='z') {
				arr[str.charAt(i)-'a']=1;
			}
		}

		for(int i:arr) {
			if(i==0) {
				count++;
			}
		}

		if(count==0)
			return "P";

		if(count==1)
			return "PL";

		return "L";
	}

}
