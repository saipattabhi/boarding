package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class allbutton {
	
	WebDriver driver;
	
	public allbutton(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//div[@class='nav-left']//a[@id='nav-hamburger-menu']")
	WebElement allfield;
	
	@FindBy(xpath = "//div[text()='TV, Appliances, Electronics']")
	
	WebElement electonicsfield;
	
	@FindBy(xpath = "//a[text()='Televisions']")
	WebElement televisionsfield;
	
	public WebElement  anyitem()
	{
		
		return allfield;
		
	}
	
	public WebElement electronicsicon()
	{
		
		return electonicsfield;
	}
	public WebElement televisionbutton()
	{
		
		return televisionsfield;
	}
	

}
