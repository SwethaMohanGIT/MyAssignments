package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		   int a=13; 
           boolean isPrime = false; 
           
           for(int i=2; i<=a/2; i++) { 
                  if(a%i==0) { 
                        System.out.println("Given number "+a+" is not a prime number"); 
                        isPrime = true; 
                        break; 
                  } 
           }if (isPrime==false){ 
                  System.out.println("Given number "+a+" is a prime number"); 
           } 

	}

}
