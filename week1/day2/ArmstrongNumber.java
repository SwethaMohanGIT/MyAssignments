package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int calculated = 0;
		int remainder;
		int inputOriginal = 153;
		int original = inputOriginal;
		while (original > 0) {
			remainder = original % 10;
			calculated = calculated + remainder * remainder * remainder;
			original = original / 10;
		}
		if (calculated == inputOriginal) {
			System.out.println("The given number is an armstrong number");
		} else {
			System.out.println("The given number is NOT an armstrong number");
		}
	}

}
