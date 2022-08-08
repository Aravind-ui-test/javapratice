package controlSatements;

import java.util.Scanner;

public class Ifelsee {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Iopex Asscement Portal: ");
	
		Scanner sc = new Scanner (System.in);
		
	int  CandidateId = sc.nextInt();
	
	
	
	System.out.println(" Assesment id :" +   CandidateId);
	
	
	//if else if CandidateId==6533 it print Cleared the round or else will print
		
	if(CandidateId==6533) {
		
		System.out.println("Congrats You got cleared the Round");
	}else
		
		System.out.println("Sorry your not Cleared ");
	
		
		
	}

}
