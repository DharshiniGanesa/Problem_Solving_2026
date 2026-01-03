
// Class Name: Day3_PrimeNumberCheck
// Problem: Program to check if a number is prime

package com.jan_week1;
import java.util.Scanner;

public class Day3_PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        if (num <= 1) {
            System.out.println("Number cannot be 0, 1, or negative");
        } else {
            boolean prime = true;

            for (int i = 2; i <num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break; 
                }
            }

            if (prime) {
                System.out.println(num + " is Prime");
            } else {
                System.out.println(num + " is Not Prime");
            }
        }

        scan.close();
    }
}