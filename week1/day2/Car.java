package week1.day2;

public class Car {
public static void main(String[] args) {
	Car obj = new Car();
	int sum = obj.addTwoNum(3, 2, 1);
	System.out.println(sum);
	int sub = obj.subTwoNum(10, 3);
	System.out.println(sub);
	float mul=obj.multiplyThreeNum(10, 5, 3);
	System.out.println(mul);
}
	public void printCarName() {
		System.out.println("Range Rover");
	}
	public short getRegNumber() {
		short regNumber = 3245;
		return regNumber;
	}
	public String getCarColour() {
		String carColour = "White";
		return carColour;
	}
	public boolean isCarPunctured() {
		boolean punchture = false;
		return punchture;
	}
	public int addTwoNum(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	private int subTwoNum(int a, int b) {
		int sub = a - b;
		return sub;
	}
	float multiplyThreeNum(float c, float d, float e) {
		float multiply = c * d * e;
		return multiply;
	}
	public int divideTwoNumm(int a, int b) {
		int divide = a / b;
		return divide;
	}
}