package controlSatements;

import java.util.Scanner;

public class OddfindIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Checking the number odd or Even :  ");
		
		Scanner sc = new Scanner (System.in);
		
		int number = sc.nextInt();
		
	System.out.println("Enter the number: "+ number);
	
	if(number%2==0) {//checking odd or even number using %2
		
		System.out.println("This is Even Number");
	}else
		
		
		System.out.println("This is Odd Number");
	}

}
