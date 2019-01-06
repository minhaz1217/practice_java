package _03_Selections;

import java.util.Scanner;

public class _01_Age {
	public static void main(String[] args) {
		final int MINOR = 21;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		if(age < MINOR) {
			System.out.println("Youth is a wonderful thing. Enjoy!");
		}
		System.out.println("Age is a state of mind.");
	}
}
