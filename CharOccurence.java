package week1.day2;

public class CharOccurence {

	public static void main(String[] args) {
		String str="Welcome to chennai";
		char search = 'e';  
		int count=0;
		
		  
		  for(int i=0; i<str.length(); i++)
		  {
		      if(str.charAt(i) == search)
		      count++;
		  }
		  System.out.println("The Character '"+search+"' appears "+count+" times.");	  }
		// TODO Auto-generated method stub

	}

