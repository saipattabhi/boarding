package tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.fifthpage;
import pageobjects.fouthpage;
import pageobjects.hello;
import pageobjects.password;
import pageobjects.seventhpage;
import pageobjects.signinpage;
import pageobjects.sixthpage;
import pageobjects.thirdwebpage;
import resource.base;

public class control extends base {

	
	
public	WebDriver driver;

	@Test
	public void control() throws IOException, InterruptedException {

		driver = intializedriver();

		driver.get(prop.getProperty("url"));

		hello Hello = new hello(driver);

		Hello.welcomepage().click();

		signinpage sign = new signinpage(driver);

		sign.emailfield().sendKeys(prop.getProperty("email"));

		sign.continuebutt().click();

		password second = new password(driver);

		second.passwordpage().sendKeys(prop.getProperty("password"));
		second.submit().click();

		thirdwebpage third = new thirdwebpage(driver);

		Select select = new Select(third.allbuttons());

		select.selectByVisibleText("Electronics");
		third.serchboxfield().sendKeys("laptop");

		third.searchbuttons().click();

		fouthpage fouth = new fouthpage(driver);

		fouth.hpitem().click();

		fouth.product().click();

		fifthpage fifth = new fifthpage(driver);

		Set<String> window = driver.getWindowHandles();

		Iterator<String> itr = window.iterator();

		String childwindow = itr.next();

		String mainwindow = itr.next();

		driver.switchTo().window(mainwindow);

		fifth.buyoption().click();

		sixthpage six = new sixthpage(driver);
		// WebDriverWait wait=new WebDriverWait(driver, 10);

		// wait.until(ExpectedConditions.visibilityOf(six.valid())).click();

		six.valid().click();
		six.paymentoption().click();
		six.button().click();
		seventhpage seven=new seventhpage(driver);
		
		Assert.assertTrue(seven.thoppage().isDisplayed());
		
		//seven.thoppage().isDisplayed();
		
		
	}

}
