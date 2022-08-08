package FileHandler;

import java.io.File;

public class FileHandlerCheck {
	
	

	public static void main(String[] args) {
		
		File a = new File("C:\\Users\\User\\Desktop\\javapratice\\folders\\fb code4.txt");
		
		System.out.println("****Used for checking the File Avalible or Not***"); 
		 
		boolean YN = a.isFile();
		
		 System.out.println(YN );
		
        System.out.println("***Used for checking file Write or not***");
		boolean n = a.canWrite();//Used for checking file Write or not
		System.out.println(n);
		
      
		System.out.println("**For Path**");
       String absolutePath = a.getAbsolutePath();//For path
       
       System.out.println(absolutePath);
       
       boolean directory = a.isDirectory();		
       
       System.out.println(directory);
       
       System.out.println("**IF condition checking File Avalible or Not**");
		if(YN) {
			
			System.out.println("File Avalible");
	}else {
		
		System.out.println("File Not Avalible");

}
}}