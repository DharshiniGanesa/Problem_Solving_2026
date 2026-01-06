
//Class Name:Day3_BuzzNumber
//Problem:Program to check buzz number

package com.jan_week2;
import java.util.Scanner;

public class Day3_BuzzNumber {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num=scan.nextInt(); 
		
		if (num % 7 == 0 || num % 10 == 7) {
            System.out.println("Buzz number");
        } else {
            System.out.println("Not a Buzz number");
        }
		
		scan.close();
	}

}
