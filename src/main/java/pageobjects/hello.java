package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hello {
	
	
	WebDriver driver;
	
	
public hello(WebDriver driver)	
{
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	
}
	
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	WebElement intial;
	
	public WebElement welcomepage()
	{
		
		return intial;
		
	}
	
	
	
	
	
	
	

}
