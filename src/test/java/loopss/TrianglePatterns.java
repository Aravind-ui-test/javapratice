package loopss;

import java.util.Scanner;

public class TrianglePatterns {

	public static void main(String[] args) {
		
		System.out.println("Triangle : Enter the number:");
		
		
	 Scanner b = new Scanner (System.in);
	 
	 int a = b.nextInt();
	 
	 for(int i=1; i<=a; i++) {
		 
		 for(int j=1; j<=a; j++) {
			 
			 System.out.print("*");
		 }
		 
		 System.out.println();
	 }
	 
		
		
	}
}