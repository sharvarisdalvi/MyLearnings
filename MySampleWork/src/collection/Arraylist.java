package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Arraylist {

	public static void main(String[] arg){
		
		ArrayList arr1=new ArrayList();
		arr1.add("1");
		arr1.add("2");
		arr1.add("3");
		arr1.add("5");
		arr1.add("6");
		arr1.add("4");
		arr1.add("2");
		
		//vector
		
		Vector v=new Vector();
		v.add("8");
		v.add("9");
	//append arraylist to vector	
		arr1.addAll(v);
		
		System.out.println("All elements get appended ");
for(int i=0;i<arr1.size();i++){
	System.out.println(arr1.get(i));
	
}
	
	//find specific element exists

boolean bln=arr1.contains("3");
System.out.println("Does arraylist contain 3?"+bln);

//find index of specific element

int indx=arr1.indexOf("4");
System.out.println("Index of 4 is : "+indx);

//find last occurence of any element

int lastocc=arr1.lastIndexOf("2");
System.out.println("Last occurence of element: "+lastocc);

//find min no from arraylist
ArrayList arr2=new ArrayList();
arr2.add("12345");
arr2.add("67895");
arr2.add("64185");
arr2.add("18545");

Object obj=Collections.min(arr2);

System.out.println("Min no from arraylist is : "+obj );
	
	}
	
	
	
}
