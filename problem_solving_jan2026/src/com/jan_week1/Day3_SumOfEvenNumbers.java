
//Class Name: Day3_SumOfEvenNumbers
//Problem: Program to print the sum of even number upto the given range

package com.jan_week1;
import java.util.Scanner;

public class Day3_SumOfEvenNumbers {
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number range upto which the sum of even number should be printed: ");
		int num = scan.nextInt();
		
		int sum=0;
		for(int i=0;i<=num;i+=2) {
			sum+=i;
		}
		System.out.println("Sum of Even numbers upto the range " + sum);
		scan.close();
	}

}
