package JavaPractice;

import java.io.File;
import java.io.IOException;

public class DemoFile {
	
	public static void main(String[] args)throws IOException {
		File f=new File("C:\\Users\\DELL\\Desktop\\Taterao.txt");
		
		if(f.createNewFile())
		{
			System.out.println("File is successfully created");
		}
		else
		{
			System.out.println("File is already exist");
		}
		
		
	}

}
