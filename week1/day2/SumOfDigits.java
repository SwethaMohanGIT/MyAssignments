package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int number = 12345; 
        int sum = 0; 
        while (number > 0) { 
               int Remainder = number % 10; 
               sum = sum + Remainder; 
               number = number / 10; 
        } 
        System.out.println("sumOfDigits : "+sum); 
	}

}
