package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class thirdwebpage {
	
	
	WebDriver driver;
	
	public thirdwebpage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="searchDropdownBox")
	
	WebElement allbutton;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	
	public WebElement allbuttons()
	{
		
		return allbutton;
	}
	
	public WebElement serchboxfield()
	{
		
		return searchbox;
	}
	public WebElement searchbuttons()
	{
		
		return searchbutton;
	}

}
