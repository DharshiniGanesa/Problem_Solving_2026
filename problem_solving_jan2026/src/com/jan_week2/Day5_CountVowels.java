

//Class Name:Day5_CountVowels
//Problem:Program to count vowels in a string

package com.jan_week2;
import java.util.Scanner;

public class Day5_CountVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scan.nextLine();  

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i)); 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Count of vowels in the string: " + count);

        scan.close();
    }
}