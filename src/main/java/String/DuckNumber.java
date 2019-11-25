// https://www.geeksforgeeks.org/check-whether-number-duck-number-not/

/*
 * Convert the given number string into number digits array and check for 0's in the number
 * 
 * If the 0 is encountered at first or no zero encountered return false else return true
 */

package main.java.String;

public class DuckNumber {
	
	public static void main(String args[])
    { 
        String num = "1423";  
          
       if(IsDuckNumber(num)) 
    	   System.out.println("It is a duck number"); 
       else
           System.out.println("It is not a duck number"); 
    } 

	public static boolean IsDuckNumber(String str) {
		if(str.charAt(0) == '0'){
			return false;
		}

		for(int i=1;i<str.length();i++) {
			if(str.charAt(i) == '0'){
				return true;
			}
		}

		return false;
	}

}
