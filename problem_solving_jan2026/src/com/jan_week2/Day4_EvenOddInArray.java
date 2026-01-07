
//Class Name:Day4_EvenOddInArray
//Problem:Program to count even and odd elements in array

package com.jan_week2;
import java.util.Scanner;
public class Day4_EvenOddInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int size = scan.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		int even=0;
        int odd=0;
		for(int i=0;i<size;i++) {
			if(arr[i] %2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		
		System.out.println("Even Count: "+even);
		System.out.println("Odd Count: "+odd);
		scan.close();
	}

}
