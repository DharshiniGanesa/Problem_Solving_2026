
//Class Name:  Day7_RemoveDuplicateChars
//Problem:Program to remove duplicate characters from string

package com.jan_week2;
import java.util.Scanner;

public class Day7_RemoveDuplicateChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}
