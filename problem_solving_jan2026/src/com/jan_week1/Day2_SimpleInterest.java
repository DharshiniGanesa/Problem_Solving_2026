//Class Name: Day2_SimpleInterest
//Problem: Program to find the Simple Interest

package com.jan_week1;
import java.util.Scanner;

public class Day2_SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Principal Amount: ");
        double p = scan.nextDouble();

        System.out.print("Enter the Rate of Interest (per year): ");
        double r = scan.nextDouble();

        System.out.print("Enter the Time duration (in years): ");
        double t = scan.nextDouble();

        double SI = (p * r * t) / 100;
        double total = p + SI;

        System.out.println("Simple Interest: " + SI);
        System.out.println("Total Amount after Interest: " + total);

        scan.close();
    }
}