
//Class Name: Day1_SumOfDigits
//Problem: Find sum of digits of a number

package com.jan_week1;
import java.util.Scanner;
public class Day1_SumOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
	    int num= scan.nextInt();
	    
	    int sum=0;
	    while(num !=0) {
	    	int digit = num%10;
	    	sum+=digit;
	    	num/=10;
	    }
	    
	    System.out.print("Sum of the digits: "+ sum );
	    scan.close();
	}

}
