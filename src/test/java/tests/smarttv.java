package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.allbutton;
import pageobjects.hello;
import pageobjects.lgsmart;
import pageobjects.password;
import pageobjects.signinpage;
import resource.base;

public class smarttv extends base {

public	WebDriver driver;

	@Test
	public void smarttv() throws IOException {

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

		allbutton all = new allbutton(driver);

		all.anyitem().click();
		all.electronicsicon().click();
		all.televisionbutton().click();
		lgsmart lg  = new lgsmart(driver);
		
    // WebDriverWait wait=new WebDriverWait(driver, 10);
     
    // wait.until(ExpectedConditions.attributeContains(lg.lgbutton(), null, null));
		
		
		
		
		
		lg.lgbutton().click();

	}

}
