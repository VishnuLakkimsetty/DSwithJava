// https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/ 


// Algorithm is like below

/**
 * Scanned the characters of infix from left to right
 * If it is a operator add to result (like A,B,C,D)
 * 
 * If it is a operand(opd) do below things:
 * 
 * if opd = '(' always push to stack
 * 
 * if opd = ')' add the operands to result until you have encountered '(' from the stack and pop out the '(' from stack
 * if '(' is not present and stack is empty throw invalid error
 * 
 * if opd = <Arithmetic operators> use below instructions
 * 
 * if top element of stack is '(' then push the opd to stack
 * 
 * if top element is not '(' and the priority of scanned opd is greater than to the top element of stack, push scanned opd
 * 
 * else pop opd from stack and add to result until the priority of scanned opd is less than or equal to the top element of stack
 */

package main.java.Stack;

import java.util.Stack;

public class InfixToPostfix {

	public static String changeIntoPost(String infixExp) {

		String result = new String();
		Stack<Character> stack = new Stack<>();

		for(int i=0;i<infixExp.length();i++) {
			
			System.out.println(result);

			char c = infixExp.charAt(i);

			if(Character.isLetterOrDigit(c)) {
				result+=c;
			} else if(c=='(') {
				stack.push(c);
			} else if (c==')') {
				while(!stack.isEmpty()&&stack.peek()!='(') {
					result+=stack.pop();
				}
				if(stack.isEmpty()) {
					throw new RuntimeException("Invalid expression");
				} else 
					stack.pop();
			} else {
				while(!stack.isEmpty()&& Prec(c)<=Prec(stack.peek())){
					if(stack.peek()=='(') { // Check for waste operands like %$& etc as ( and )  has least priorities
						throw new RuntimeException("Invalid Expression");
					} else {
						result+=stack.pop();
					}
				}
				stack.push(c);
			}
		}

		while(!stack.isEmpty()) {
			if(stack.peek()!='(')
			result+=stack.pop();
			else throw new RuntimeException("Invalid expression");
		}
		return result;

	}

	public static int Prec(char c) {
		switch(c) {
		case '+':
		case '-':
			return 0;

		case '*':
		case '/':
			return 1;
		case '^':
			return 3;
		}

		return -1;
	}
	
	public static void main(String[] args) {
		String exp = "a+b*(c^d/e)^(f+g*h)-i"; 
		
        System.out.println(changeIntoPost(exp));
	}


}
