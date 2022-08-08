package Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Arrayss {

	public static void main(String[] args) {
		System.out.println("Array");
		
    
		
		
		
		String phone [] = {"Iphone","MI","vivo","Nothing","Nokia","poco","Poco"};
		
		
		
    System.out.println(Arrays.toString(phone));//To Print All Given Data
    
   for (String X : phone) {   //For showing without order
	   
	   System.out.println(X);
	
}
		
	for(int i =0; i<phone.length; i++){ //
	
		
		String ai = Arrays.toString(phone);
		
		System.out.println(ai);
			
		
	}
	
	int a [] = new int [3];
	
   a[0] =1; 
   a[1] =2;
   a[2] =3;
  
   
 System.out.println(Arrays.toString(a));
 
   for (int i : a) {
	System.out.println(i);
}
   
}}
