
//Class Name:Day4_ElementOccurrenceArray
//Problem:Program to count element occurrence in array

package com.jan_week2;
import java.util.Scanner;

public class Day4_ElementOccurrenceArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int size = scan.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}

		System.out.println("Enter the element to be counted: ");
		int find=scan.nextInt();
		
		int count=0;
		for(int i=0;i<size;i++) {
			if(arr[i] == find) {
				count++;
			}
		}
        System.out.println("The Element " +find+" occur " +count+" times.");
        
        scan.close();
	}

}
