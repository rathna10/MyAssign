package week1.day2;

public class NegativeToPositiveNumber {

	public static void main(String[] args) {
		int positiveVal  = -40;

	    int negativeVal = (~(positiveVal - 1));
		positiveVal = ~(negativeVal - 1);
	    System.out.println("Result: The number -40 converted to "+negativeVal);
		// TODO Auto-generated method stub

	}

}