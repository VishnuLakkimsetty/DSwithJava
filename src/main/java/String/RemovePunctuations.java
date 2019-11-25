//https://www.geeksforgeeks.org/removing-punctuations-given-string/

/*
 * Punctuations in the string can be removed by using regex and replacing the punctuation symbols with empty string
 */

package main.java.String;

public class RemovePunctuations {
	public static void main(String[] args) 
    { 
        // input string 
        String str = "Welcome???@@##$ to#$% Geeks%$^for$%^&Geeks"; 
          
        // similar to Matcher.replaceAll 
        str = str.replaceAll("\\p{Punct}",""); 
          
        System.out.println(str); 
    } 
}
