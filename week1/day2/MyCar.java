package week1.day2;

public class MyCar {
public static void main(String[] args) {
	Car obj1 = new Car();
	int sum = obj1.addTwoNum(3, 12, 1);
	System.out.println(sum);
	//int sub = obj1.subTwoNum(10, 3); private method, can't access outside the class
	//System.out.println(sub);
	float mul=obj1.multiplyThreeNum(100, 5, 3);
	System.out.println(mul);
}
}
