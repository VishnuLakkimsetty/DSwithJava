// https://www.geeksforgeeks.org/reverse-words-given-string-java/

/*
 * Split the words at 'space' character and rejoin each word with space in reverse order
 */

package main.java.String;

public class ReverseWords {
	public static void main(String[] args) 
    { 
        String str = "geeks for me"; 
        System.out.println(reversingWord(str)); 
    } 
	
	public static String reversingWord(String str) {
		String[] sArray = str.split(" ");
		String conv = "";
		for(int i=sArray.length-1;i>=0;i--) {
			conv = conv+sArray[i]+" ";
		}
		return conv;
	}

}
