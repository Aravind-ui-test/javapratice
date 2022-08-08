package FileHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		
		
		
		try {
			@SuppressWarnings("resource")
			FileWriter mywriter = new FileWriter("C:\\Users\\User\\Desktop\\javapratice\\folders\\one.txt");
			mywriter.write("hello");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
