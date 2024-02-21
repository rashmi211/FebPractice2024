package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CW4_ChildBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.khanacademy.org/login");
		
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.xpath("(//button[@class='_1up6svzf'])[1]"));
		gmail.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Set<String>handle=driver.getWindowHandles();
		Iterator<String> itr=handle.iterator();
		
		while(itr.hasNext()) {
			String whandle=itr.next();
			driver.switchTo().window(whandle);	
			String ctitle=driver.getTitle();
			System.out.println(ctitle);
			if(ctitle.equals("Sign in - Google Accounts")) {	
				WebElement gmail1=driver.findElement(By.xpath("//input[@type='email']"));
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
				wait.until(ExpectedConditions.visibilityOf(gmail1));
				gmail1.sendKeys("salunkeraashmi");
			}
		}
			
		
	}

}
