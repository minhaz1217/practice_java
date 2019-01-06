package _03_Selections;

import java.text.NumberFormat;
import java.util.Scanner;

public class _02_Wages {
	public static void main(String[] args) {
		final double RATE = 8.25;
		final int STANDARD = 40;
		Scanner input = new Scanner(System.in);
		double pay = 0.0;
		System.out.println("Enter the number of hours worked: ");
		int hours = input.nextInt();
		System.out.println();
		if(hours > STANDARD) {
			pay = STANDARD * RATE + (hours - STANDARD) * ( RATE * 1.5);
		}else {
			pay = hours * RATE;
		}
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println("Gross earnings: " + fmt.format(pay));
	}
}
