
//Class Name:Day3_AreaOfCircle
//Problem: Program to find the are of the circle

package com.jan_week1;
import java.util.Scanner;
public class Day3_AreaOfCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		double r = scan.nextDouble();
		
		double area = (3.14 * r * r);
		
		System.out.println("Area of the circle: "+area);
        scan.close();
	}

}
