package loopss;

import java.util.Scanner;

public class Patternss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is same rolws same colums * Patterns program
		
		Scanner n = new Scanner (System.in);
		
		System.out.println("Square:Enter the number:");
		
		int ar = n.nextInt();
		
		
		for(int i=1; i<=ar; i++) {
			
			for(int j=1; j<=ar; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("In this Patterns Rows and Colums Are same");
	}}
			
	