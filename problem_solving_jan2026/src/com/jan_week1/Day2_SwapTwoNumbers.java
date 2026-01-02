
//Class Name: Day2_SwapTwoNumbers 
//Problem: Program to swap two numbers

package com.jan_week1;
import java.util.Scanner;
public class Day2_SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number1: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the number2: ");
		int num2 = scan.nextInt();

		System.out.println("Before Swapping: ");
		System.out.println("Number1: " + num1);
		System.out.println("Number2: " + num2);
		
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping: ");
		System.out.println("Number1: " + num1);
		System.out.println("Number2: " + num2);
		
		scan.close();
	}

}
