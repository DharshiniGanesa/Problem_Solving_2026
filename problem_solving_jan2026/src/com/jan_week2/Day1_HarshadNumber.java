package com.jan_week2;

import java.util.Scanner;

public class Day1_HarshadNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scan.nextInt();

        int result=0;
        while(n!=0) {
        	int digit = n%10;
        	result+=digit;
        	n/=10;
        }
        
        if(n % result == 0) {
        	 System.out.println("Harshad Number" );
        }else {
        	 System.out.println("Not a Harshad Number" );
        }
       
        scan.close();
	}

}
