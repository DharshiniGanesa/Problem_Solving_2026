
//Class Name:Day4_LinearSearch
//Problem:Program to perform linear search

package com.jan_week2;
import java.util.Scanner;
public class Day4_LinearSearch {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the size: ");
			int size = scan.nextInt();
			
			int [] arr = new int[size];
			System.out.println("Enter the elements: ");
			for(int i=0;i<size;i++) {
				arr[i]=scan.nextInt();
			}

			System.out.println("Enter the element to be searched: ");
			int find=scan.nextInt();
			
			boolean result = false;
			for(int i=0;i<size;i++) {
				if(arr[i] == find) {
					result=true;
				}
			}
			
			if(result) {
				System.out.println("Element is found");
			}else {
				System.out.println("Element is not found");
			}
			
			scan.close();
	}

}
