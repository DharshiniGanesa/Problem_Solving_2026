
//Class Name: Day2_SpyNumber
//Problem: Program to check spy number

package com.jan_week2;
import java.util.Scanner;

public class Day2_SpyNumber {
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		int temp=num;
		
		int sum=0;
		while(num!=0) {
			int digit = num%10;
			sum+=digit;
			num/=10;
		}

		int product=1;
		while(temp!=0) {
			int digit = temp%10;
			product*=digit;
			temp/=10;
		}
		
		if(product == sum) {
			System.out.println("Spy Number");
		}else {
			System.out.println("Not a Spy Number");
		}
		
		scan.close();
	}

}
