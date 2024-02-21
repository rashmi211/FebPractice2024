package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

@Listeners(practice.CW16_ListenersDemo.class)

public class CW3_AlertPopup extends CW17_BaseClass {
	ExtentReports rp;
	ExtentTest test;
	
     	@BeforeTest
     	public void configreport() {
    	 rp=CW18_ExtentReport.createReport();
     	}
	
	
	
		@BeforeMethod
		public void open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		}
		
		
		
		@Test
		public void handleAlert() {
		test=rp.createTest("handlealert");
		WebElement promt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		promt.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("ok");
		alert.accept();
		WebElement txt=driver.findElement(By.xpath("//p[text()='You entered: ok']"));
		boolean b=txt.isDisplayed();
		Assert.assertEquals(b, true);
		
	}
		
		//here you will capture test result
		@AfterMethod
		public void closeBrowser(ITestResult result) {
			if(result.getStatus()==ITestResult.SUCCESS) {
				test.log(Status.PASS, result.getName());
			}
			else if(result.getStatus()==ITestResult.FAILURE) {
				test.log(Status.FAIL, result.getName());
			}
			else {
				test.log(Status.SKIP, result.getName());
			}
			driver.close();
		}
		
		
		@AfterTest
		public void flush() {
			rp.flush();
			
		}

}
