package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CW5_Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		WebElement drp=driver.findElement(By.xpath("//select[@id='first']"));
		
		Select sel=new Select(drp);
		List<WebElement>op=sel.getOptions();
		
		for(int i=0; i<op.size(); i++) {
			System.out.println(op.get(i).getText());
		}
		
		sel.selectByValue("Google1");
}
}