
//Class Name:  Day3_CelsiusToFahrenheit
//Problem: Program to convert celsius to fahrenheit

package com.jan_week1;
import java.util.Scanner;
public class Day3_CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Celsius: ");
		double celsius = scan.nextDouble();
		
		double fahrenheit = ((celsius * 9/5) + 32);
		
		System.out.println("Converted to Fahrenheit: " +fahrenheit);
		scan.close();
	}

}
