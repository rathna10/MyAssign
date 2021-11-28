package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
	   
			 int firstNum=0,secNum=1,sum,i;
			 int count=8;    
			 System.out.print(firstNum+" "+secNum);
			 
			 //printing 0 and 1    
			    
			 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
			 {    
			  sum=firstNum+secNum;    
			  System.out.print(" "+sum);    
			  firstNum=secNum;    
			  secNum=sum; 
		}

		
		// TODO Auto-generated method stub

	}
}

