
//Class Name: Day3_PrintEvenNumbers
//Problem: Program to print even number upto the given range

package com.jan_week1;
import java.util.Scanner;
public class Day3_PrintEvenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number range upto which the even number should be printed: ");
		int num = scan.nextInt();
		
		System.out.println("Even numbers upto the range " + num);
		for(int i=0;i<=num;i+=2) {
			System.out.print(" " + i);
		}
		scan.close();
	}
}
