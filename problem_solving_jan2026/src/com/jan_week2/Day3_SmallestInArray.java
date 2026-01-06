
//Class Name: Day3_SmallestInArra
//Problem:Program to find smallest element in array

package com.jan_week2;
import java.util.Scanner;

public class Day3_SmallestInArray {
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size=scan.nextInt();
		
		int[]arr = new int[size];
		
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}

		int min = arr[0];
		
		for(int i=1;i<size;i++) {
			if(min >arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Maximum element of the array: " + min);
		scan.close();
	}

}
