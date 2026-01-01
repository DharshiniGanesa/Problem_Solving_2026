
//Class Name: Day1_PositiveNegativeZero
//Problem: Check whether a number is positive, negative, or zero

package com.jan_week1;
import java.util.Scanner;
public class Day1_PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number you want to check: ");
	    int num= scan.nextInt();
	    
	    if(num == 0) {
	    	System.out.print("The number is equal to zero ");
	    }else if(num>0) {
	    	System.out.print("The number is positive");
	    }else {
	    	System.out.print("The number is negative");
	    }
     scan.close();
	}

}
