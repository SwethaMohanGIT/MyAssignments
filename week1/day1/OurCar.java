package week1.day1;

import week1.day2.Car;

public class OurCar {
	public static void main(String[] args) {
		Car obj2 = new Car();
		int sum = obj2.addTwoNum(3, 12, 1);
		System.out.println(sum);
		//int sub = obj1.subTwoNum(10, 3); private method, can't access outside the class
		//System.out.println(sub);
		//float mul=obj1.multiplyThreeNum(100, 5, 3); default method, can't access outside the class
		//System.out.println(mul);
	}

}
