
//Class Name: Day1_ProductOfDigits
//Problem: Program to find product of digits using loop

package com.jan_week2;

import java.util.Scanner;

public class Day1_ProductOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n =scan.nextInt();
		int product=1;
		while(n!=0) {
			int digit = n%10;
			 product*=digit;
			 n/=10;
		}
		System.out.println("Product of Digits: "+product);
		scan.close();
	}
}
