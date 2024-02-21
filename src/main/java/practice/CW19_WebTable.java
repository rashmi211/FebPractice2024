package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CW19_WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
	
//		List<WebElement>li=driver.findElements(By.xpath("//thead//tr//th"));
//		li.size();
//		for(int i=0; i<li.size(); i++) {
//			System.out.println(li.get(i).getText());
//		}
	
		List<WebElement>li1=driver.findElements(By.xpath("(//tbody)[2]//tr//td[3]"));
		li1.size();
		double max=0;
		for(int i=0; i<li1.size(); i++) {
			String text=li1.get(i).getText();
			double d=Double.parseDouble(text);
			if(d>max) {
				max=d;
			}
		}
		System.out.println("Maximun prev price is "+max);
		
		List<WebElement>li2=driver.findElements(By.xpath("(//tbody)[2]//tr//td[3]"));
		li1.size();
		String minst=li1.get(0).getText();
		double min=Double.parseDouble(minst);
		
		for(int i=1; i<li1.size(); i++) {
			String text=li1.get(i).getText();
			double d=Double.parseDouble(text);
			if(d<min) {
				min=d;
			}
		}
		System.out.println("Minimum prev price is "+ min);
		
		
	
	}
}
