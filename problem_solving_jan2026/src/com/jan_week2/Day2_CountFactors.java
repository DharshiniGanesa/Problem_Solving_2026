package com.jan_week2;
import java.util.Scanner;

public class Day2_CountFactors {
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		int count=0;
		for(int i=1;i<Math.sqrt(num);i++) {
			if(num%i == 0) {
				count++;
			}
		}
        System.out.println("Count of the Factorial: "+count);
        scan.close();
	}

}
