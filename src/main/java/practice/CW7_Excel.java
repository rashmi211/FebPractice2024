package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CW7_Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("F:\\SOFTWARE TESTING\\All notes\\Automation\\Selenium\\Test Data.xlsx");
		
	String data=WorkbookFactory.create(file).getSheet("App1").getRow(2).getCell(1).getStringCellValue();
	
	System.out.println(data);
	
	
	
	
	}

}
