
//Class Name: Day3_PowerOfNumber
//Problem: Program to print the power of numbers

package com.jan_week1;
import java.util.Scanner;
public class Day3_PowerOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the base: ");
		int base = scan.nextInt();
		
		System.out.println("Enter the power: ");
		int power = scan.nextInt();
		
		double result = Math.pow(base, power);
		System.out.println("Power : "+result);
		scan.close();
		
	}

}
