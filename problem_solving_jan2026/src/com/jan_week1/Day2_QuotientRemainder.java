
//Class Name: Day1_SumOfDigits
//Problem: Find sum of digits of a number

package com.jan_week1;
import java.util.Scanner;

public class Day2_QuotientRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the divisor: ");
        int num2 = scan.nextInt();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int quo = num1 / num2;
            int rem = num1 % num2;
            System.out.println("Quotient: " + quo);
            System.out.println("Remainder: " + rem);
        }

        scan.close();
    }
}
