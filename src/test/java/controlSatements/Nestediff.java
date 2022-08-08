package controlSatements;

import java.util.Scanner;

//This is Nested If we have using this more than One if statement 

public class Nestediff {

	public static void main(String[] args) {
		
		System.out.println("Welcome To Employee ABCD Internal Assessment Portal");
		
		System.out.println("Enter your employee id Below:");
	
		Scanner a = new Scanner (System.in);
			int score = a.nextInt();
		
		System.out.println("Enter your Employee id :"+ score);
			
		if(score==6533) {
			
			System.out.println("Congrats ! : Your Selected in Software Testing Team");
		}
		
			if(score==6522) {
				System.out.println("Congrats ! :Your Selected in Digital Markting Team");
				
			}if(score==4567) {
				
				System.out.println("Congrats ! : Your selected for Analyst Role(Team not yet fixed)");
		}
			
	}}
