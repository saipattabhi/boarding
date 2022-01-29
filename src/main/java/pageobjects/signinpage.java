package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpage {
	
	WebDriver driver;
	
	public signinpage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id = "ap_email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	public WebElement emailfield()
	{
		
		return email;
		
	}
	public WebElement continuebutt()
	{
		return continuebutton;
	}

}
