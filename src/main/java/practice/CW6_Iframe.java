package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CW6_Iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		WebElement el=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		
	//	driver.switchTo().frame(el);
	//	driver.switchTo().frame(0);
		driver.switchTo().frame("singleframe");
		
		WebElement el1=driver.findElement(By.xpath("//input[@type='text']"));
		el1.sendKeys("rashmi21");
		
		driver.switchTo().defaultContent();
		
		WebElement el2=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		el2.click();
		
		WebElement fr3=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(fr3);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(5000));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		
		WebElement el3=driver.findElement(By.xpath("//input[@type='text']"));
		el3.sendKeys("rashmi21");
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		
		WebElement el5=driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
		el5.click();
		
		
	}

}
