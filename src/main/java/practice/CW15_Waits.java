package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CW15_Waits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement pic=driver.findElement(By.xpath("//a[text()='Desktops']"));
		Actions act=new Actions(driver);
		act.moveToElement(pic);
		act.perform();
				
		WebElement pic1=driver.findElement(By.xpath("(//ul[@class='list-unstyled']//li)[2]//a"));
		pic1.click();
		
	
	}
}
