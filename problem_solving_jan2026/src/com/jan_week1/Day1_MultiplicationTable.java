
//Class Name: Day1_MultiplicationTable
//Problem: Print multiplication table of a given number

package com.jan_week1;
import java.util.Scanner;
public class Day1_MultiplicationTable{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
	    int num= scan.nextInt();
	    
	  
	    for(int i=1;i<=10;i++) {
	    	System.out.println("" + num + "*" + ""+i+ "=" + ""+ (num*i));
	    }
	    
	    scan.close();
	}

}

