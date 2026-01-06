
//Class Name:Day3_SumOfArray
//Problem:Program to find sum of array elements

package com.jan_week2;
import java.util.Scanner;
public class Day3_SumOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size=scan.nextInt();
		
		int[]arr = new int[size];
		int sum=0;
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
			 sum +=arr[i];
		}

		System.out.println("Array: ");
		for(int i=0;i<size;i++) {
			System.out.print(" " + arr[i]);	
		}
		System.out.println();	
		System.out.println("Sum of array elements: "+sum);
	}

}
