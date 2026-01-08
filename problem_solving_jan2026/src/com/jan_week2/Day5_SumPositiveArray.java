

//Class Name: Day5_SumPositiveArray
//Problem:Program to find sum of positive elements in array

package com.jan_week2;
import java.util.Scanner;
public class Day5_SumPositiveArray {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int size = scan.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<size;i++) {
			if(arr[i] > 0) {
			   sum+=arr[i];
			}
		}
		
		System.out.println("Sum of positive numbers: "+sum);
	
		scan.close();

	}

}
