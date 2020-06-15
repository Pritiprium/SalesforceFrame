package com.POM_login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Browser_utility;
import com.Utility.TestBase;


public class Home_POM extends TestBase{
	
	public  Home_POM (WebDriver driver) {
		TestBase.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='Login']")
	WebElement lgn;
	
	@FindBy(id = "home_Tab")
	WebElement home;
	

	public void setcredential(String UName , String Password) {
		username.sendKeys(UName);
		password.sendKeys(Password);
		lgn.click();
		
		Browser_utility.waitforVisiblity(home);
		String actual = home.getText();
		assertEquals(actual, "Home");
		
		home.click();
		
	}
	
	
}
