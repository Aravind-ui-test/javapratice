package FileHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFile {

	public static void main(String[] args) throws IOException {
	
//		File pen = new File ("C:\\Users\\User\\Desktop\\javapratice\\folders\\fb code4.txt");
//		boolean canWrite = pen.canWrite();
//		System.out.println(canWrite);
		
		File f = new File("C:\\Users\\User\\Desktop\\javapratice\\A");
		boolean k =	f.mkdir();// mkdir to create  folders
		System.out.println(k);
		
		try(FileWriter mywriter = new FileWriter ("C:\\Users\\User\\Desktop\\javapratice\\A\\new.txt")){
			mywriter.write("Welcome to java\n");
			mywriter.append("This is Aravind \n");
			mywriter.append("India\n");
			mywriter.append("Welcome \n");
			mywriter.append("zoho \n");}
		
			System.out.println("Sucessfully done");
		
		
		
			
	
}}
