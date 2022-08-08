package loopss;

import java.util.Scanner;

public class RightSideTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Right side Triangle: Please Enter Number:");
		
		Scanner ad = new Scanner(System.in);
		
		int a = ad.nextInt();
		
		for(int i =1; i<=a; i++) {
			
			for(int j=1; j<=i; j++ ) {
				
				System.out.print(" ");
		}
			
				
				for(int j=1; j<=i; j++ ) { 
					
					System.out.print("*");
					
				}

				System.out.println();
	}

}}
