
//Class Name: Day1_PalindromeNumber
//Problem: Check whether a number is palindrome

package com.jan_week1;
import java.util.Scanner;
public class Day1_PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
	    int num= scan.nextInt();
	    
	    int original = num;
	    int rev=0;
	    while(num !=0) {
	    	int digit = num%10;
	    	rev = rev*10+digit;
	    	num/=10;
	    }
	    
	    if(rev == original) {
	    	System.out.print("The entered number is a palindrome" );
	    }else {
	    	System.out.print("The entered number is not palindrome" );
	    }
	    scan.close();
	}

}

