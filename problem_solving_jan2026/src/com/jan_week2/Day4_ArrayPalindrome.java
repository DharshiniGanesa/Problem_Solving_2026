package com.jan_week2;
import java.util.Scanner;

public class Day4_ArrayPalindrome {
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
		for(int i=size-1;i>=0;i--) {
			cpy[i] = arr[i];
		}
		
		boolean result = false;
		for(int i=0;i<size;i++) {
			if(arr[i] == cpy[i]) {
				result = true;
			}
		}
		
		if(result) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		scan.close();
	}

}
