
//Class Name:Day1_CountPrimeDigits
//Problem: Program to count prime digits

package com.jan_week2;
import java.util.Scanner;
public class Day1_CountPrimeDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        int count = 0;

        while (n != 0) {
            int digit = n % 10;
            boolean isPrime = true;
            if (digit < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(digit); i++) {
                    if (digit % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                count++;
            }

            n /= 10;
        }

        System.out.println("Count of Prime Digits: " + count);
        scan.close();
    }
}