package TestScripts;

import java.util.Arrays;

public class sortCharArray {

	public static void main (String []arg){
		char[] c1=new char[]{'r','d','t','b','n','i'};
		
		System.out.println("Original array");
		for (int ind=0;ind<c1.length;ind++)
		{
			System.out.println(""+c1[ind]);
		}
		System.out.println("Sorted array");
		Arrays.sort(c1);
		for (int ind=0;ind<c1.length;ind++)
		{
			System.out.println(""+c1[ind]);
		}
	
		
		
		
	}
	
	
	
	
}
