package week1.day2;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		int num[] = { 20, -10, 0 };
		int numSize = num.length;
		for (int i = 0; i < numSize; i++) {
			if (num[i] > 0) {
				System.out.println(num[i] + " - Number is Positive");
			} else if (num[i] < 0) {
				System.out.println(num[i] + " - Number is Negative");
			} else if (num[i] == 0) {
				System.out.println(num[i] + " - Number is neither positive or negative");
			}
		}

	}

}
