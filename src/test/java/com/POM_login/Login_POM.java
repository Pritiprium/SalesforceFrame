package com.POM_login;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Browser_utility;
import com.Utility.TestBase;

public class Login_POM extends TestBase {

	public Login_POM(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='Login']")
	WebElement lgn;

	public void set_ValidCredential(String uName, String password1) {
		Browser_utility.waitforVisiblity(username);
		username.sendKeys(uName);
		Browser_utility.waitforVisiblity(password);
		password.sendKeys(password1);
	}
	
	public void Invalid_Credential(String invaliduName,String invalidpassword) {
		Browser_utility.waitforVisiblity(username);
		username.sendKeys(invaliduName);
		Browser_utility.waitforVisiblity(password);
		password.sendKeys(invalidpassword);
		Browser_utility.waitforVisiblity(lgn);
		lgn.click();
	}

	public void loginbtn() {
		lgn.click();
	}

}
