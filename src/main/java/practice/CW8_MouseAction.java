package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CW8_MouseAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		WebElement rclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
//		act.moveToElement(rclick);
//		act.contextClick(rclick);
//		act.build().perform();
		
		WebElement dclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.doubleClick(dclick);
		act.perform();
		
		Alert al=driver.switchTo().alert();
		al.accept();
		
		
}
}