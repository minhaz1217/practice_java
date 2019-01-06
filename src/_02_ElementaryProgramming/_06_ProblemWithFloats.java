package _02_ElementaryProgramming;

public class _06_ProblemWithFloats {
	public static void main(String[] args) {
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 -0.1 -0.1 );
		// outputs 0.5000000000000001 instead of 0.5
		System.out.println(1.0 - 0.9);
		// outputs 0.09999999999999998 instead of 0.1
	}
}
