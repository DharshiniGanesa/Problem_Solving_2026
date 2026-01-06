
//Class Name:Day3_SumFirstLastDigit
//Problem:Program to find sum of first and last digit

package com.jan_week2;
import java.util.Scanner;
public class Day3_SumFirstLastDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		
		int lastDigit=num%10;
		
		int firstDigit=0;
		while(num!=0) {
			int digit=num%10;
			firstDigit=digit;
			num/=10;
		}
		
		int sum = firstDigit + lastDigit;
        System.out.println("Sum of First and Last Digit: "+sum);
        
        scan.close();
	}

}
