package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sixthpage {
	
	WebDriver driver;
	
	public sixthpage(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[text()='Choose an Option']")
	
	WebElement validation;
	
	@FindBy(xpath = "//a[text()='State Bank of India']")
	WebElement payment;
	@FindBy(name = "ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
	
	WebElement conbutton;
	
	public WebElement valid()
	{
		
		return validation;
	}
	
	public WebElement paymentoption()
	{
		
		return payment;
	}
	
	
	public WebElement button()
	{
		return conbutton;
	}
	

}
