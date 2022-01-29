package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fouthpage {
	
	WebDriver driver;
	
	public fouthpage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	
	@FindBy(xpath = "//span[text()='HP']")
	WebElement hpproduct;

	@FindBy(xpath = "//span[text()='HP Pavilion 14, 11th Gen Intel Core i5 8GB RAM/512GB SSD 14 inch(35.6 cm) Laptop, FHD IPS Micro-Edge Display/Iris Xe Graphics/Backlit KB/B&O Audio/Alexa/FPR/Win 11/Thin & Light/1.41kg, 14-dv1000TU']")
	WebElement item;
	
	public WebElement hpitem()
	{
		
		return hpproduct;
	}
	
	public WebElement product()
	{
		
		return item;
	}
	

}
