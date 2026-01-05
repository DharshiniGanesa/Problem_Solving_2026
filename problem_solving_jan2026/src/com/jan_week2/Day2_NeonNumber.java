
//Class Name:Day2_NeonNumber
//Problem: Program to check neon number

package com.jan_week2;
import java.util.Scanner;

public class Day2_NeonNumber {
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		int square = num*num;
		
		int sum=0;
		while(square!=0) {
			int digit = square%10;
			sum+=digit;
			square/=10;
		}
        if(sum == num) {
        	System.out.println("Neon NUmber");
        }else {
        	System.out.println("Not a Neon NUmber");
        }
        
        scan.close();
	}

}
