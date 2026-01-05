
//Class Name: Day2_AutomorphicNumber
//Problem: Program to check automorphic number

package com.jan_week2;
import java.util.Scanner;
public class Day2_AutomorphicNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		int square = num*num;
		
		int squareDigit = square %10;
		
		int numDigit = num%10;
		
		if(squareDigit == numDigit ) {
			System.out.println("AutomorphicNumber");
		}else {
			System.out.println("Non A AutomorphicNumber");
		}
       scan.close();
	}

}
