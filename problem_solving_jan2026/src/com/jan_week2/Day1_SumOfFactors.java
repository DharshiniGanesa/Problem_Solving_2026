
//Class Name: Day1_SumOfFactors
//Problem: Program to find sum of factors

package com.jan_week2;
import java.util.Scanner;

public class Day1_SumOfFactors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scan.nextInt();

        int sum=0;
        for(int i=1 ;i<=n;i++) {
        	if(n%i == 0) {
        		sum+=i;
        	}
        }
        System.out.println("Sum of Factors: "+sum);
	}
}
