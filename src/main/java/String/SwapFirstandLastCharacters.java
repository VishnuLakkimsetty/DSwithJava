// https://www.geeksforgeeks.org/java-program-swap-first-last-characters-words-sentence/

/*
 * Convert the sentence/String into Char array
 * 
 * Now for each rotation, Store the index of first word and loop the array till you encounter space
 * 
 * Once space is encountered, swap the first and the character at current index-1 position
 * 
 * Do this till the string length
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 * 
 */

package main.java.String;

public class SwapFirstandLastCharacters {
	public static void main(String[] args) 
    { 
        String str = "geeks for geeks"; 
        System.out.println(swapCharactersOfWord(str)); 
    } 
	
	public static String swapCharactersOfWord(String str) {
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			int k=i;
			
			while(i<str.length() && str.charAt(i)!=' ') {
				i++;
			}
			
			char temp = ch[k];
			ch[k]=ch[i-1];
			ch[i-1]=temp;
		}
		
		return new String(ch);
	}
}
