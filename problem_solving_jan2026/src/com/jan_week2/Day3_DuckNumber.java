
//Class Name:Day3_DuckNumber
//Problem:Program to check duck number

package com.jan_week2;
import java.util.Scanner;
public class Day3_DuckNumber {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num=scan.nextInt(); 
		
		int temp = num;
		
		while(temp!=0) {
			temp/=10;
		}
		
		boolean result = false;
		if(num !=0) {
		int firstDigit=0;
		while(num >0) {
			int digit=num%10;
			firstDigit=digit;
			if(firstDigit == 0) {
				result = true;
				break;
			}
			num/=10;
		}
		}
		
		if(result == true) {
			System.out.println("Duck number");
		}else {
			System.out.println("Not a Duck number");
		}
		
		scan.close();
	}

}
