package _04_Math_Chars_Strings;

public class _02_Math_Functions {
	public static void main(String[] args) {
		
		// Trigonometric methods
		System.out.println("\nTrigonometric Methods");
		System.out.println(Math.PI);
		System.out.println(Math.PI/6); // 0.5
		System.out.println(Math.sin(0)); //0
		System.out.println(Math.cos(0)); //0
		System.out.println(Math.tan(0)); //0
		System.out.println(Math.acos(0)); //0
		System.out.println(Math.asin(0)); //0
		System.out.println(Math.atan(0)); //0
		System.out.println(Math.PI/6); // 0.5
		
		System.out.println("\nExponent Methods");
		System.out.println(Math.exp(1)); //2.71
		System.out.println(Math.log(2.71)); //1.0
		System.out.println(Math.log10(1000)); //0
		System.out.println(Math.pow(2,3)); //0
		System.out.println(Math.sqrt(9)); //0

		System.out.println("\nRounding Methods"); 
		System.out.println(Math.ceil(1.1000)); //2
		System.out.println(Math.floor(1.99999)); //1
		System.out.println(Math.round(1.54)); //2
		System.out.println(Math.round(1.49)); //1
		System.out.println(Math.rint(2.11)); //0
		System.out.println(Math.rint(2.5)); //0
		
		System.out.println("Min Max Abs");
		System.out.println(Math.min(5,100)); //0
		System.out.println(Math.max(5,100)); //0
		System.out.println(Math.abs(-25)); //0
		
		System.out.println("\nGenerating random numbers");
		for(int i=0;i<5;i++) {
			System.out.println(Math.random() + " ");
		}
		System.out.println("");
	}
}
