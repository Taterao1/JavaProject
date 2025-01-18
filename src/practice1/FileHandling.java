package practice1;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	
	public static void main(String[]args)
	{
		File newFile=new File("C:\\SQL2019.txt");
		try {
			newFile.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("New file created");
	}

}
