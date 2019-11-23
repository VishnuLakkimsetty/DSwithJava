//https://www.geeksforgeeks.org/check-balanced-parentheses-expression-o1-space/

/*
 * Instead of using a stack as we did in BalancedParenthesis we can use a simple counter whose value is incremented for 
 * open parenthesis and the value is decremented for closed parenthesis
 * 
 * If that value is 0 then the exp is balanced else unbalanced (+ve value represents more open parenthesis and 
 * -ve value represents more closed parenthesis)
 * 
 * This approach will have O(n) time complexity and O(n) space complexity as no extra space is required (i.e, not using Stack)
 *  
 */

package main.java.Stack;

import java.util.ArrayList;
import java.util.List;

public class BalancedParanthesisOptimised {

	public static void main(String[] args) {

		String exp = "}{()()}"; 
		if (checkBalance(exp)) 
			System.out.println("Balanced "); 
		else
			System.out.println("Not Balanced ");

	}

	public static boolean checkBalance(String exp) {
		int l = 0;
		List<Integer> storeOpenBracesIndex = new ArrayList<Integer>();
		for (int i=0; i<exp.length();i++) {
			char c = exp.charAt(i);

			if (c=='(' || c == '{' || c == '[') {
				if(l>=0) {
					l++;
					storeOpenBracesIndex.add(i);
				}
				else {
					System.out.println("Printing counter value :: "+l);
					return false;
				}

			} else if (c==')' || c == '}' || c == ']') {
				if(l>=0) {
					try {
						if(c==')') {
							if(exp.charAt(storeOpenBracesIndex.get(storeOpenBracesIndex.size()-1))=='(')
								storeOpenBracesIndex.remove(storeOpenBracesIndex.size()-1);
							else
								return false;
						}else if(c=='}') {
							if(exp.charAt(storeOpenBracesIndex.get(storeOpenBracesIndex.size()-1))=='{')
								storeOpenBracesIndex.remove(storeOpenBracesIndex.size()-1);
							else
								return false;
						}else if(c==']') {
							if(exp.charAt(storeOpenBracesIndex.get(storeOpenBracesIndex.size()-1))=='[')
								storeOpenBracesIndex.remove(storeOpenBracesIndex.size()-1);
							else
								return false;
						}
					} catch (Exception e) {
						return false; // If the first element of the exp is closing brace
					}

					l--;
				}					
				else {
					return false;
				}

			}  
		}



		if(l==0)
			return true; 
		else 
			return false;

	}

}
