package Enummm;

import java.util.Iterator;
import java.util.Scanner;

enum day{
	
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY
}

public class enumm {

	
	public static void main(String[] args) {
		
		
		day days = day.SUNDAY;
	
		
    
		
		
		switch(days) {
		
		case SUNDAY:
			
			System.out.println("Today WEEK OFF");
			
			break;
			
         case MONDAY:
			
			System.out.println("Work Day ");
			
			break;
			
         case TUESDAY:
 			
 			System.out.println("2nd Working Day of Week ");
 			
 			break;
 			
         case WEDNESDAY:
  			
  			System.out.println("3rd Working Day of Week ");
  			
  			break;
  			
         case THRUSDAY:
   			
  			System.out.println("4th Working Day of Week ");
  			
  			break;
  			
         case FRIDAY:
    			
   			System.out.println("FRIDAY happy Friday ");
   			
   			break;
			
   			
         case SATURDAY:
 			
    			System.out.println("Week OFF ");
    			
    			break;
		
			default:
				
				System.out.println("invalid key pressed");
			
		}
	}}
