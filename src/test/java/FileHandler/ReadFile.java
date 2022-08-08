package FileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
	
		File a = new File("C:\\Users\\User\\Desktop\\javapratice\\folders\\fb code4.txt");
		
		Scanner cv = new Scanner(a);
		
		System.out.println(cv);
		
		while (cv.hasNext()) {
			
			String read = cv.next();
			System.out.println(read);
			
		}		
	}
}