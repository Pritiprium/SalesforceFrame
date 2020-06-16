package com.POM_login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Listner_Report.Report_Utility;
import com.Utility.Browser_utility;
import com.Utility.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class Home_POM extends TestBase {
	Report_Utility obreport = new Report_Utility();


	public Home_POM(WebDriver driver) {
		TestBase.driver = driver;
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

	public void setcredential(String UName, String Password) {
		username.sendKeys(UName);
		password.sendKeys(Password);
		lgn.click();
		obreport.CreatReport();
		obreport.CreatTest("homebuttonis displayed or not");
		obreport.logger.log(LogStatus.PASS,"login success");
	}

	public void homepg() {
		Browser_utility.waitforVisiblity(home);
		obreport.logger.log(LogStatus.PASS, "home button is displayed");
		home.click();
		obreport.EndTestCase();
		obreport.EndReport();

	}

}
