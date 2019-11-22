//Implement two stacks in an array
//https://www.geeksforgeeks.org/implement-two-stacks-in-an-array/

/*
 * One approach is to divide array into 2 halves. One half for 1st Stack and the other for 2nd Stack. But this is not space efficient
 * as it will throw exception for first array once after half of array is filled even if the other half is empty 
 * 
 * Second approach is to start one stack from first and other from last of the array.
 */
package main.java.Stack;

public class TwoStacks {
	
	int[] arr;
	int size;
	int top1,top2;
	
	
	public TwoStacks(int n) {
		arr = new int[n];
		size = n;
		top1 = -1;;
		top2 = size;
	}

	
	// Push operation
	
	public void push1(int i) {
		if(top1<top2-1) {
			arr[++top1]=i;
		} else {
			throw new RuntimeException("Stack Overflow");
		}
	}
	
	public void push2(int i) {
		if(top1<top2-1) {
			arr[--top2]=i;
		} else {
			throw new RuntimeException("Stack Overflow");
		}
	}
	
	
	// Pop operation
	
	public int pop1() {
		int i;
		if(top1!=-1) {
			i = arr[top1--];
		} else {
			throw new RuntimeException("Stack Underflow");
		}
		
		return i;
	}
	
	
	public int pop2() {
		int i;
		if(top1!=size) {
			i = arr[top2++];
		} else {
			throw new RuntimeException("Stack Underflow");
		}
		
		return i;
	}
	
	public void printStack() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
