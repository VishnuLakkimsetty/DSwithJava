// https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/

package main.java.String;

import java.util.Arrays;

public class CheckAnagram {
public static void main(String[] ars) {
	String s1 = "SILENT";
	String s2 = "LISTEN";
	String s3 = "LISTES";
	System.out.println(IsAnagram(s1,s2));
	System.out.println(IsAnagram(s1,s3));
}

 static boolean IsAnagram(String s1, String s2) {
	if(s1.length()!=s2.length())
		return false;
	else {
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0;i<str1.length;i++) {
			if(str1[i]==str2[i])
				continue;
			else
				return false;
		}
		return true;
	}
}
}
