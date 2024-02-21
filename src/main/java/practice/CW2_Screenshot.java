package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CW2_Screenshot {
	public static void pictiure(String name,WebDriver driver) throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File destination=new File("F:\\SOFTWARE TESTING\\All notes\\Automation\\Selenium\\Pictures\\"+name+".jpg");
	
		FileHandler.copy(source, destination);
	
	}

}
