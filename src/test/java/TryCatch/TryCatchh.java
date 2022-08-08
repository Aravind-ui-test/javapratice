package TryCatch;

import java.io.InputStream;
import java.util.Scanner;

public class TryCatchh {

	public static void main(String[] args) {
		
		System.out.println("Enter number");
		
		try{
			
			Scanner a = new Scanner(System.in);
		
		int num1 = a.nextInt();
		
		System.out.println("Enter the 1st Number "+ num1);
		
		int num2 =a.nextInt();
		
		System.out.println("Enter the 2nd Number "+ num2);
		
		System.out.println(num1/num2);

	}catch (Exception e) {
		System.out.println("Number 2 cannot be a 0");
	}

}}
