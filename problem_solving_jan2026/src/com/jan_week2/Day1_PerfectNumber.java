
//Class Name: Day1_PerfectNumber
//Problem: Program to check perfect number

package com.jan_week2;
import java.util.Scanner;
public class Day1_PerfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scan.nextInt();

        int num = n;
        int sum=0;
        for(int i=1 ;i<=n/2;i++) {
        	if(n%i == 0) {
        		sum+=i;
        	}
        }
        
        if(sum == n) {
        	   System.out.println(""+n+" is a perfect number");
        }else {
        	 System.out.println(""+n+" is not a perfect number");
        }
        
        scan.close();
	}

}
