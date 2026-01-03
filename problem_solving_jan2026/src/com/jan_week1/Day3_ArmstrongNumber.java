package com.jan_week1;
import java.util.Scanner;
public class Day3_ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
	    int num= scan.nextInt();
	    
	    int count=0;
	    while(num!=0) {
	    	count++;
	    	num/=10;
	    }
	    
	    int original = num;
	    double rev=0;
	    while(num !=0) {
	    	int digit = num%10;
	    	rev = rev*10+Math.pow(digit, count);
	    	num/=10;
	    }
	    
	    if(rev == original) {
	    	System.out.print("The entered number is a Armstrong Number" );
	    }else {
	    	System.out.print("The entered number is not Armstrong Number" );
	    }
	    scan.close();
	}

}


