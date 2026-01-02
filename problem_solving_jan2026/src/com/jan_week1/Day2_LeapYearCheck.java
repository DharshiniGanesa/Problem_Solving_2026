
//Class Name: Day2_LeapYearCheck
//Problem: Program to find the leap year

package com.jan_week1;
import java.util.Scanner;
public class Day2_LeapYearCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		int year = scan.nextInt();
		
		if (year == 0) {
            System.out.println("Year cannot be Zero");
        } else if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

		scan.close();
		}
		

	}


