package loopss;

import java.util.Scanner;

public class HillPattern {

	public static void main(String[] args) {
		
		System.out.println("Hill Pattern :Enter any number:");
		
		
Scanner ad = new Scanner(System.in);
		
		int a = ad.nextInt();
		
		for(int i=1; i<=a; i++) {
			
		for(int j=i; j<=a; j++) {
			System.out.print("  ");
		}
		
		for(int j= 1; j<i; j++) {
			
		System.out.print("* ");

	}for(int j=1; j<=i; j++ ) {
		
		System.out.print("* ");
		
	}
	
	System.out.println();

}}}
