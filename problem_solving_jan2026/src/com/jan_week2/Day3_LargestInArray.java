
//Class Name: Day3_LargestInArray
//Problem:Program to find largest element in array

package com.jan_week2;
import java.util.Scanner;

public class Day3_LargestInArray {
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size=scan.nextInt();
		
		int[]arr = new int[size];
		
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}

		int max = arr[0];
		
		for(int i=1;i<size;i++) {
			if(max < arr[i]) {
				max =arr[i];
			}
		}
		System.out.println("Maximum element of the array: " + max);
		scan.close();
	}

}
