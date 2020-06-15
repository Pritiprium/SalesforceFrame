package com.POM_login;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.TestBase;

public class Login_POM extends TestBase{
	//Logger log = new Logger(getClass().getSimpleName());
	
	public Login_POM(WebDriver driver) {
		TestBase.driver =driver;
		PageFactory.initElements(driver, this);
	}
	//Logger log = new Logger(getClass().getSimpleName());
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='Login']")
	WebElement lgn;

	public void setcredential(String UName , String Password) {
		username.sendKeys(UName);
		password.sendKeys(Password);
		lgn.click();
	}

	
	

}
