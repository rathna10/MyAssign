package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
	
		      int myArray1[] = {20, 36, 96, 78, 55};
		      int myArray2[] = {78, 45, 20, 73, 53};
		      System.out.println("Intersection of the two arrays ::");
		     
		      for(int i = 0; i<myArray1.length; i++ ) {
		         for(int j = 0; j<myArray2.length; j++) {
		            if(myArray1[i]==myArray2[j]) {
		               System.out.println(myArray2[j]);
		            }
		         }
		      }
		   }
	
		// TODO Auto-generated method stub

	}
