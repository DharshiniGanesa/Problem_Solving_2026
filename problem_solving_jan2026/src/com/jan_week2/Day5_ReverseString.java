package com.jan_week2;

import java.util.Scanner;

public class Day5_ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scan.nextLine();  

        System.out.println("Reverse of string: ");
        for (int i =str.length()-1; i >=0; i--) {
        	System.out.print(""+str.charAt(i));
            }
        scan.close();
        
        }   
	}


