// https://www.geeksforgeeks.org/java-program-swap-first-last-characters-words-sentence/

/*
 * First we will create an Char array of given String by using toCharArray() method.
 * 
 * Now we iterate the char array by using for loop.
 * 
 * In for loop, we declare a variable whose value is dependent on i.
 * 
 * Whenever we found an alphabet we increase the value of i and whenever we reach at space, 
 * we are going to perform swapping between first and last character of the word which is previous of space. 
 * 
 * Time complexity = O(N) where N is length of String
 * Space complexity = O(N) as we are creating an extra array of size N
 */

package main.java.String;

public class SwapFirstLastCharacters {
	public static void main(String[] args) 
    { 
        String str = "geeks for geeks"; 
        System.out.println(modifyLine(str)); 
    }
	
	public static String modifyLine(String str) {
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int k=i;
			
			while(i<ch.length && ch[i]!=' ') {
				i++;
			}
			
			char temp = ch[k];
			ch[k]=ch[i-1];
			ch[i-1]=temp;
			
		}
		
		return String.valueOf(ch);
	}
}
