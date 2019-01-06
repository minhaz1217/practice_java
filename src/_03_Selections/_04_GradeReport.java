package _03_Selections;

import java.util.*;
public class _04_GradeReport {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grade: ");
		int grade = input.nextInt();
		int category = grade/10;
		System.out.print("That grade is ");
		switch(category) {
		case 10:
			System.out.println("a perfect score, well done.");
			break;
		case 9:
			System.out.println("well above average. Excellent.");
			break;
		case 8:
			System.out.println("above average. Nice job");
			break;
		case 7:
			System.out.println("Average");
			break;
		case 6:
			System.out.println("Below average. Do better!");
			break;
		default:
			System.out.println("Not passing");
		}
	}
}
