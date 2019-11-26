// https://www.geeksforgeeks.org/find-one-extra-character-string/

/*
 * Time Complexity O(N+N+1)
 * Space Complexity O(1)
 */

package main.java.String;

public class ExtraCharacter {
	public static void main(String args[]) {
		printExtraCharacter("manish", "anish");
	}

	public static void printExtraCharacter(String strA, String strB) {
		int Sum = 0;

		for (char x : strA.toCharArray()) {
			Sum += x;
		}
		for (char x : strB.toCharArray()) {
			Sum -= x;
		}
		System.out.println((char) (abs(Sum)));
	}

	public static int abs(int a) {
		return a > 0 ? a : a - a - a;
	}
}
