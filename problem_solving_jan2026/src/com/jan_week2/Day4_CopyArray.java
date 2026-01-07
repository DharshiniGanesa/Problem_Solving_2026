

//Class Name:Day4_CopyArray
//Problem:Program to copy one array to another

package com.jan_week2;
import java.util.Scanner;

public class Day4_CopyArray {
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int size = scan.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		
		int[] cpy = new int[size];

		for(int i=0;i<size;i++) {
			cpy[i] = arr[i];
		}
		
		System.out.println("Enter the copy array: ");
		for(int i=0;i<size;i++) {
			System.out.print(""+cpy[i]);
		}
		scan.close();
	}

}
