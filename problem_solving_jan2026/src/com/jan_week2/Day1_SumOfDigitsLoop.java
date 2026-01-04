

//Class Name: Day1_SumOfDigitsLoop
//Problem: Program to find sum of digits using loop

package com.jan_week2;
import java.util.Scanner;
public class Day1_SumOfDigitsLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n =scan.nextInt();
		int sum=0;
		while(n!=0) {
			int digit = n%10;
			 sum+=digit;
			 n/=10;
		}
		System.out.println("Sum of Digits: "+sum);
		scan.close();
	}

}
