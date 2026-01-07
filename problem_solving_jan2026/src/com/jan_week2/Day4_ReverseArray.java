
//Class Name:Day4_ReverseArray
//Problem:Program to reverse an array

package com.jan_week2;
import java.util.Scanner;
public class Day4_ReverseArray {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int size = scan.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}

		System.out.println("Array before Reversing: ");
		for(int i=0;i<size;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		System.out.println("Array after Reversing: ");
		for(int i=size-1;i>=0;i--) {
			System.out.print(" "+arr[i]);
		}
		
		scan.close();
	}

}
