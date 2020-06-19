package com.Utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.Listner.Report_Utility;
import com.Listner.TestListner;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(com.Listner.TestListner.class)
public class TestBase {

	public static WebDriver driver;
	public Browser_utility objectOfBrwsrUtils = new Browser_utility();
	public String userid;
	public String password;
	public String Invalid_Userid;
	public String Invalid_Password;
	public Report_Utility obReport = new Report_Utility();
	public TestListner objectTestListner = new TestListner();
	public propertyLoader objectofProperty = new propertyLoader();
	public Common_Utility objectOfcommonUtil = new Common_Utility();

	@BeforeSuite
	public void TriggerDependency() throws Exception {
		objectOfcommonUtil.loadlog4jPropertyFile(
				System.getProperty("user.dir") + "\\src\\main\\resources\\properties\\log4j.properties");
		
		objectOfBrwsrUtils.launchbrwsr();

	}

	@BeforeTest
	public void sendindCredential() throws Exception {
		objectOfcommonUtil.dataforCredential(); // sending credential before every test.
		userid = objectOfcommonUtil.Valid_userid;
		password = objectOfcommonUtil.Valid_password;
		Invalid_Userid = objectOfcommonUtil.Invalid_userid;
		Invalid_Password = objectOfcommonUtil.Invalid_password;
	}

	@AfterSuite
	public void closebrowser() {
		objectOfBrwsrUtils.Tearoff();

	}
}
