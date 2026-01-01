
//Class Name: Day1_LargestOfThree 
//Problem: Find the largest among three numbers

package com.jan_week1;
import java.util.Scanner;
public class Day1_LargestOfThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the 1st number : ");
	    int num1= scan.nextInt();
	    System.out.print("Enter the 2nd number : ");
	    int num2= scan.nextInt();
	    System.out.print("Enter the 3rd number : ");
	    int num3= scan.nextInt();
	       
	    if( num1 > num2 && num1 > num3) {
	    	System.out.print(" " + num1 + " is greater");
	    }else if(num2 > num1 && num2 > num3) {
	    	System.out.print(" " + num2 + " is greater");
	    }else {
	    	System.out.print(" " + num3 + " is greater");
	    }
     scan.close();
	}

}
