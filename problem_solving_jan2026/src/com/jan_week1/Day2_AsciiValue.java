
//Class Name: Day2_AsciiValue 
//Problem: Program to find the ASCII value

package com.jan_week1;
import java.util.Scanner;
public class Day2_AsciiValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		char ch = scan.nextLine().charAt(0);
		
		System.out.println("ASCII Value: " + (int)ch);
		
		scan.close();
	}

}
