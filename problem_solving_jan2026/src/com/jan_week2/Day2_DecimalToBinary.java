
//Class Name:  Day2_DecimalToBinary
//Problem: Program to convert decimal to binary

package com.jan_week2;
import java.util.Scanner;
public class Day2_DecimalToBinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		
		String result = " ";
		while(num!=0) {
			int digit = num%2;
			result= digit + result;
			num/=2;
		}
		System.out.println("Binary conversion: "+result);
		scan.close();
	}

}
