
//Class Name:Day3_DigitOccurrence
//Problem:Program to count occurrence of a digit

package com.jan_week2;
import java.util.Scanner;

public class Day3_DigitOccurrence {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num=scan.nextInt(); 
		
		System.out.println("Enter the number to be checked : ");
		int check=scan.nextInt();
		
		int number;
		int count=0;
		while(num >0) {
			int digit=num%10;
			number=digit;
			if(number == check) {
				count++;
			}
			num/=10;
		}

		System.out.println("Occurrence of the digit: "+count);
	}

}
