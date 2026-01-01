
//Class Name: Day1_CountDigits
//Problem: Count number of digits in a number

package com.jan_week1;
import java.util.Scanner;
public class Day1_CountDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
	    int num= scan.nextInt();
	    	   
	    int count=0;
	    while(num !=0) {
	    	count++;
	    	num/=10;
	    }
	    System.out.print("No of digits: "+count);
	    scan.close();
	}

}

