package _04_Math_Chars_Strings;

public class _03_TestRandomCharacters {
	public static void main(String[] args) {
		System.out.print("A random char a - z is: ");
		System.out.println(RandomCharacter.getRandomLowerCaseLetter());


		System.out.print("A random char A - Z is: ");
		System.out.println(RandomCharacter.getRandomUpperCaseLetter());
		

		System.out.print("A random char 0 - 9 is: ");
		System.out.println(RandomCharacter.getRandomDigitCharacter());
		

		System.out.print("A random char g - m is: ");
		System.out.println(RandomCharacter.getRandomCharacter('g', 'm'));
		

		System.out.print("A random char 3 - 7 is: ");
		System.out.println(RandomCharacter.getRandomCharacter('3', '7'));

		System.out.print("A random char a - z is: ");
		System.out.println(RandomCharacter.getRandomLowerCaseLetter());

		System.out.print("A random char ! - * is: ");
		System.out.println(RandomCharacter.getRandomCharacter('!', '*'));
	}
}
