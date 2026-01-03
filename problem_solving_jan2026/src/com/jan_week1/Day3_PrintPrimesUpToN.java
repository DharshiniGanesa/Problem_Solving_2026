// Class Name: Day3_PrintPrimesUpToN
// Problem: Program to print prime numbers up to a given number

package com.jan_week1;
import java.util.Scanner;

public class Day3_PrintPrimesUpToN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        if (num <= 1) {
            System.out.println("Number cannot be 0, 1, or negative");
        } else {
            System.out.println("Prime numbers up to " + num + ":");
            for (int i = 2; i <= num; i++) {
                boolean prime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        scan.close();
    }
}