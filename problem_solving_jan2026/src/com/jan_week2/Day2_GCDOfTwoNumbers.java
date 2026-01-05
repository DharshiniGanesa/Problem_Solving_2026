
//Class Name: Day2_GCDOfTwoNumbers
//Problem:Program to find GCD of two numbers

package com.jan_week2;
import java.util.Scanner;
public class Day2_GCDOfTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number1: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the number2: ");
		int num2 = scan.nextInt();
		
		while(num2!=0) {
			int temp = num2;
			num2 = num1%num2;
			num1=temp;
		}
		  System.out.println("GCD is: " + num1);
	      scan.close();

	}

}
