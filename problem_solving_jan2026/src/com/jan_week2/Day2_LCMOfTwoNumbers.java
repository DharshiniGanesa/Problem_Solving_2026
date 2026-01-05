//Class Name: Day2_LCMOfTwoNumbers
//Problem: Program to find LCM of two numbers

package com.jan_week2;
import java.util.Scanner;

public class Day2_LCMOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number1: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the number2: ");
        int num2 = scan.nextInt();

        int a = num1;
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (num1 * num2) / gcd;

        System.out.println("LCM is: " + lcm);
        scan.close();
    }
}