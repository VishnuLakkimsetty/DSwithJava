// https://www.geeksforgeeks.org/program-find-initials-name/

/*
 * Split the name at "space" character into String array and print the first character of each element in String array
 * 
 */

package main.java.String;

public class PrintInitialInName {
	public static void main(String[] args) {
		String name = "prabhat kumar singh";
		
		printInitials(name);
	}
	public static void printInitials(String str) {
		String[] name = str.split(" ");
		
		for(String s : name) {
			System.out.print(s.toUpperCase().charAt(0) + " ");
		}
	}

}
