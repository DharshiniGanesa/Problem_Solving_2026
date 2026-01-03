
// Class Name: Day3_PerimeterOfRectangle
// Problem: Program to find the perimeter of the rectangle

package com.jan_week1;
import java.util.Scanner;

public class Day3_PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Length: ");
        double length = scan.nextDouble();

        System.out.print("Enter the Breadth: ");
        double breadth = scan.nextDouble();

        double perimeter = 2 * (length + breadth);

        System.out.printf("Perimeter of the Rectangle: ", perimeter);

        scan.close();
    }
}