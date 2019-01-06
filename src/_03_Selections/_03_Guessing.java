package _03_Selections;
import java.util.*;
public class _03_Guessing {
	public static void main(String[] args) {
		final int MAX = 10;
		int answer , guess;
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		answer = generator.nextInt(MAX) + 1;
		System.out.println("I'm thinking of a number between 1 and " + MAX + ". Guess what it is: " );
		
		guess = input.nextInt();
		if(guess == answer) {
			System.out.println("You got it! Good Guessing!!");
		}else {
			System.out.println("That is not correct!");
			System.out.println("The number was "+ answer);
		}
	}
}
