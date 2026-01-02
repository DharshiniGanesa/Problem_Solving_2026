//Class Name: Day2_LargestOfFour
//Problem: Program to find largest of four numbers

package com.jan_week1;
import java.util.Scanner;

public class Day2_LargestOfFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number2: ");
        int num2 = scan.nextInt();
        System.out.print("Enter number3: ");
        int num3 = scan.nextInt();
        System.out.print("Enter number4: ");
        int num4 = scan.nextInt();

        //when all the input is equal
        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("All numbers are equal");
        } else {
            int largest = Math.max(Math.max(num1, num2), Math.max(num3, num4));
            System.out.println(largest + " is the greatest");
        }

        scan.close();
    }
}