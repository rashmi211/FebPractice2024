package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CW11_POM {
	@FindBy(xpath="") private WebElement ele1;
	@FindBy(xpath="") private WebElement ele2;
	@FindBy(xpath="") private WebElement ele3;
	@FindBy(xpath="") private WebElement ele4;
	@FindBy(xpath="") private WebElement ele5;
	
	
	public CW11_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public void enterUsername(String username) {
		ele1.sendKeys(username);
	}
	
	
}
