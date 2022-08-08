package Arrays;

import java.util.Scanner;

public class ArrayssPratice {

	public static void main(String[] args) {
		
		System.out.println("Using String : Getting The Size of Array From the User");
		
		Scanner z = new Scanner (System.in);
		
		System.out.println("Please Enter The Size of Array");
		
		int size = z.nextInt();
		
		System.out.println("Entered Array Size is: " + size );
		
		String [] array = new String  [size];
		
		for (int i = 0; i <size; i++) {
			
			System.out.println("Enter the String (Name or product)");
			
			array[i] =z.next(); 
			
		}

		
		z.close();
		
		System.out.println("Entered array is below");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}
		
	}

}
