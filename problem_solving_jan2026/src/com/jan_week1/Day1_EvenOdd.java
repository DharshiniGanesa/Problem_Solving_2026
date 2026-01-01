
//Class Name: Day1_EvenOdd
//Problem: Check whether a given number is even or odd

package com.jan_week1;
import java.util.Scanner;
public class Day1_EvenOdd {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	       
	       System.out.print("Enter the number you want to check: ");
	       int num= scan.nextInt();
	       
	       if(num %  2==0) {
	    	   System.out.print("The number is Even");
	       }else {
	    	   System.out.print("The number is odd");
	       }
	       scan.close();
	}      
}
