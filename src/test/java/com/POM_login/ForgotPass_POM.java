package com.POM_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Listner.Report_Utility;
import com.Utility.Browser_utility;
import com.Utility.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class ForgotPass_POM extends TestBase {
	public ForgotPass_POM(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}

	Report_Utility objectofReport = new Report_Utility();

	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	@FindBy(xpath = "//a[@id='forgot_password_link']")
	WebElement forgotPaas;

	@FindBy(xpath = "//a[contains(text(),'Forgot Your Password?')]")
	WebElement text;

	public WebElement forgotpassword() {
		Browser_utility.waitforVisiblity(username);
		username.sendKeys("priti.p@salesforce.com");
		// Browser_utility.waitforVisiblity(text);
		Browser_utility.waitforVisiblity(forgotPaas);
		// forgotPaas.click();
		return forgotPaas;
	}

}
