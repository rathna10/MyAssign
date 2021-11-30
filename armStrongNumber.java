package week1.day2;

public class armStrongNumber {
	

	public static void main(String[] args) {
		int input=22;
		int orgNum=input;
		int sum=0;
		
				while (input>0) {
				int rem= input %10;
			 sum=sum+ (rem*rem*rem);
			 input= input /10;
			 }
				if(orgNum==sum) {
		System.out.println("Given number is armstrong number");
				}
				else {
		System.out.println("Given number is not a armstrong number");
				}
				
					
					
				}
		// TODO Auto-generated method stub

	}
