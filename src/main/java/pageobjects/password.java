package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class password {
	
	
	
	WebDriver driver;
	
	public password(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id="ap_password")
	WebElement passwordfield;
	
	@FindBy(id="signInSubmit")
	WebElement submitbutton;
	
	public WebElement passwordpage()
	{
		
		return passwordfield;
	}
	
	public WebElement submit()
	{
		
		return submitbutton;
	}
	

}
