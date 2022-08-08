package controlSatements;

import java.util.Scanner;

public class ElseifLadderr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter any 2 value");
		
		Scanner c = new Scanner(System.in);
		
		int a = c.nextInt();
		
	   System.out.println(a);
	   
	   int b = c.nextInt();
	   
	   System.out.println(b);
	   
	   if(a>b) {
		   
		   System.out.println("A is Greater Than B");
	   }else if (b>a){
	   
	   System.out.println("B is Greater Than A");
	   

	}else {
		
		System.out.println("Values are Equal");
	}

}
}
