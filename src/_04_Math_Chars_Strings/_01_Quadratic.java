package _04_Math_Chars_Strings;

import java.util.Scanner;


public class _01_Quadratic {
	public static void main(String[] args) {
		int a,b,c; // ax2 + bx + c
		double discriminant, root1, root2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the coefficient of x squared: ");
		a = input.nextInt();
		System.out.print("Enter the coefficient of x: ");
		b = input.nextInt();
		System.out.print("Enter the constant: ");
		c = input.nextInt();
		
		discriminant = Math.pow(b,2) - (4*a*c);
		root1 = ( (-1*b) + Math.sqrt(discriminant) )/ (2*a); 
		root2 = ( (-1*b) - Math.sqrt(discriminant) )/ (2*a);
		System.out.println("Root 1: " + root1);
		System.out.println("Root 2: " + root2);
		/*
		 * Enter 3 8 4 for input
		 * result: -0.66666 and -2.0
		 * 
		 */
		
	}
}
