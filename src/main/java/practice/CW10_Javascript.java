package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CW10_Javascript {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	
	
	WebElement ele=driver.findElement(By.xpath("//input[@id='userName']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].value='rashmi'", ele);
	
	
	WebElement scr=driver.findElement(By.xpath("//button[@id='submit']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",scr);

	((JavascriptExecutor)driver).executeScript("arguments[0].click();",scr);
	
}}
