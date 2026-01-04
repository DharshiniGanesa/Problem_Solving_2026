
//Class Name:  Day1_SumOfSquaresOfDigits
//Problem: Program to find sum of square of digits

package com.jan_week2;
import java.util.Scanner;

public class Day1_SumOfSquaresOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scan.nextInt();

        int result=0;
        while(n!=0) {
        	int digit = n%10;
        	result+=digit*digit;
        	n/=10;
        }
        System.out.println("Sum of Square of digits:" + result);
        scan.close();
	}

}
