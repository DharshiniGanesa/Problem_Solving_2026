
//Class Name: Day1_ReverseNumber 
//Problem: Reverse a given number

package com.jan_week1;
import java.util.Scanner;
public class Day1_ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
	    int num= scan.nextInt();
	    
	    int rev=0;
	    while(num !=0) {
	    	int digit = num%10;
	    	rev = rev*10+digit;
	    	num/=10;
	    }
	    
	    System.out.print("Reverse of the number: "+ rev );
	    scan.close();
	}

}
