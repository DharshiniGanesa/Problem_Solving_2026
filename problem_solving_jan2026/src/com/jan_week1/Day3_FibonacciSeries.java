package com.jan_week1;
import java.util.Scanner;
public class Day3_FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		int temp;
		int first =0;
		int second=1;
		
		System.out.println("Fibonacci Series: ");
		for(int i =0;i<num;i++) {
			System.out.print(" "+first);
			temp=first+second;
			first=second;
			second = temp;
		}
		scan.close();
	}

}
