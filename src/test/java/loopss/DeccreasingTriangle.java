package loopss;

import java.util.Scanner;

public class DeccreasingTriangle {

	public static void main(String[] args) {
		// This is Decreasing Triangle
		
		System.out.println("Decreasing Triangle: Please Enter Number:");
		
		Scanner ad = new Scanner(System.in);
		
		int a = ad.nextInt();
		
		for(int i =1; i<=a; i++) {
			
			for(int j =i; j<=a; j++) {
				
				System.out.print("*");
			}
				System.out.println();
				
		}
			

	}

}
//Assume user input is 5
//1 to 5 * * * * *   // i=1
//2 to 4 * * * *      // i=2
//3 to 3 * * *      // i=3
//2 to 2 * *   //i=4
//1 to1  *   //i=5