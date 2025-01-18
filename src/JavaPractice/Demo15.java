package JavaPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo15 {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Address Detail.xlsx");

		
		XSSFWorkbook workbook = new XSSFWorkbook();
	
	}

}
