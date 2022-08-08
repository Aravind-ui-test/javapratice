package controlSatements;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello ! Welcome to the Empolyee Portal");
		
	
		
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String strDate= formatter.format(date); 
	    
	    System.out.println("Date :"+strDate);  
	    
	    System.out.println("Enter Your Employee Id: ");
		
		
		
		Scanner s = new Scanner(System.in);
     
		int val = s.nextInt();
		
		System.out.println("Employee id: "+ val);
		
		switch(val) {
		
		case 6533:
		
		System.out.println("Employee Name: Aravind");
		System.out.println("Role: Analyst");
		
		break;
		
		case 6531:
			
			System.out.println("Employee Name: Venki");
			System.out.println("Role: Bussiness Analyst");
			
			break;
			
       case 6530:
			
			System.out.println("Employee Name: Venki");
			System.out.println("Role: Bussiness Analyst");
			
			break;
			
       case 6529:
			
			System.out.println("Employee Name: iopex");
			System.out.println("Role: senior Analyst");
			
			break;
			
			default:
				
				System.out.println("Invalid Employee id");
				System.out.println("Please Check your Employee id");
		}
		
		System.out.println("Please Reachout if have any issue : venki78@gmail.com");
	}

	
	}


