// https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/

/*
 * Algorithm:
 * 
 * All open type parenthesis are pushed to stack
 * 
 * If a scanned parenthesis is closed one and the top element of stack is matching the corresponding open parenthesis, 
 * then pop the top from stack else not matched return false
 * 
 * After all check if stack is not empty then also the parenthesis is unbalanced
 * 
 * This approach takes O(n) time complexity and O(n) space complexity for stack holding the paranthesis
 */

package main.java.Stack;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		
		String exp = "{()}a[]"; 
        if (checkBalance(exp)) 
          System.out.println("Balanced "); 
        else
          System.out.println("Not Balanced ");

	}

	public static boolean checkBalance(String exp) {
		Stack<Character> stack = new Stack<>();
		for (int i=0; i<exp.length();i++) {
			char c = exp.charAt(i);

			if (c=='(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')') {
				if(!stack.isEmpty() && stack.peek()=='(') {
					stack.pop();
				}
				else {
					return false;
				}
			} else if (c == '}') {
				if(!stack.isEmpty() && stack.peek()=='{') {
					stack.pop();
				}
				else {
					return false;
				}
			} else if (c == ']') {
				if(!stack.isEmpty() && stack.peek()=='[') {
					stack.pop();
				}
				else {
					return false;
				}
			} 
		}

		if(stack.isEmpty())
			return true;
		else 
			return false;

	}

}
