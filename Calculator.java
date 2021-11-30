package week1.day2;


public class Calculator {
	private static Calculator calc;
	public int add (int num1,int num2) {
		
		return num1+num2;
}  
public double sub (double num3,double num4) {
		
		return num3-num4;
}
public double mul (double num5,double num6) {
	
	return num5*num6;
}  
public int div (int num7,int num8) {
	
	return num7/num8;
}  
     public static void main(String[] args) {
		Calculator.calc=new Calculator();
		
	System.out.println(calc.add(20,30));
	System.out.println(calc.sub(40,20));
	System.out.println(calc.mul(56,25));
	System.out.println(calc.div(10,5));
		}
		
		
		// TODO Auto-generated method stub

	}


