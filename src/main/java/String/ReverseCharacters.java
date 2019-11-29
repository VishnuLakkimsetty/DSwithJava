// https://www.geeksforgeeks.org/reverse-a-string-in-java/

package main.java.String;

public class ReverseCharacters {

	public static void main(String[] args) 
    { 
        String input = "Geeks For Me"; 
        System.out.println(reversingString(input));
    }
	public static String reversingString(String str) {
		char[] ch = str.toCharArray();
		int left = 0, right = ch.length-1;
		for(left=0; left<right;left++,right--) {
			char temp = ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
		}
		return new String(ch);
	}
}

