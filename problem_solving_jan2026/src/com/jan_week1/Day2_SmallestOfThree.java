

//Class Name: Day2_SmallestOfThree
//Problem: Program to find smallest of three numbers

package com.jan_week1;
import java.util.Scanner;

public class Day2_SmallestOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number2: ");
        int num2 = scan.nextInt();
        System.out.print("Enter number3: ");
        int num3 = scan.nextInt();

        //when all the input is equal
        if (num1 == num2 && num2 == num3 ) {
            System.out.println("All numbers are equal");
        } else {
            int largest = Math.min(Math.min(num1, num2), (num3));
            System.out.println(largest + " is the smallest");
        }

        scan.close();
    }
}