package _02_ElementaryProgramming;

import java.util.Scanner;

public class _03_ComputeAreaWithConsoleInput {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter a number for radius: ");
		 double radius = input.nextDouble();
		 double area = radius * radius * 3.14159;
		 System.out.println("The area with radius: " + radius + " is " + area);
	 }
}