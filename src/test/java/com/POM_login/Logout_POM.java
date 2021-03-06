package com.POM_login;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Listner.Report_Utility;
import com.Utility.Browser_utility;
import com.Utility.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class Logout_POM extends TestBase {

	public Logout_POM(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='Login']")
	WebElement lgn;

	@FindBy(xpath = "//span[@id='userNavLabel']")
	WebElement userdropdown;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logoutBtn;

	Report_Utility obreport = new Report_Utility();

	public void setcredential(String UName, String Password) {
		Browser_utility.waitforVisiblity(username);
		username.sendKeys(UName);
		Browser_utility.waitforVisiblity(password);
		password.sendKeys(Password);
	}

	public void login_Button_clicked() {
		lgn.click();
	}

	public WebElement logouttab() throws Exception {
		Browser_utility.waitforVisiblity(userdropdown);
		userdropdown.click();
		Browser_utility.waitforVisiblity(logoutBtn);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return logoutBtn;
	}

}
