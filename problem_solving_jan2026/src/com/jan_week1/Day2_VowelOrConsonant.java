
//Class Name: Day2_VowelOrConsonant
//Problem: Program to check vowel or consonant

package com.jan_week1;
import java.util.Scanner;

public class Day2_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char ch = scan.next().toLowerCase().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Error: Please enter an alphabetic character.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

        scan.close();
    }
}