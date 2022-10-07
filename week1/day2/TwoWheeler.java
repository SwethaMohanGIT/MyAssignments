package week1.day2;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 3 ;
	long chassisNumber = 32146 ;
	boolean isPunctured = false;
	String bikeName = "Honda" ;       
	double runningKM = 25000.233F;
	
	public static void main(String[] args) {
		
		TwoWheeler tw = new TwoWheeler();
		System.out.println(tw.noOfMirrors);
		System.out.println(tw.bikeName);
		System.out.println(tw.isPunctured);
		System.out.println(tw.chassisNumber);
		System.out.println(tw.noOfWheels);
		System.out.println(tw.runningKM);
		
	}

}
