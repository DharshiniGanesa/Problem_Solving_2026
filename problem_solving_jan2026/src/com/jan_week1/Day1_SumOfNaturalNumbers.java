
//Class Name: Day1_SumOfNaturalNumbers
//Problem: Find the sum of first n natural numbers

package com.jan_week1;
import java.util.Scanner;
public class Day1_SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
	    int num= scan.nextInt();
	    
	    int sum=0;
	    for(int i=0;i<=num;i++) {
	    	sum+=i;
	    }
	    System.out.print("Sum of natural numbers: " + sum);
	    scan.close();
	}

}
