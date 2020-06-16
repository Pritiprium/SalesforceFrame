package com.Utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Listner_Report.Report_Utility;
import com.Listner_Report.TestListner;
import com.relevantcodes.extentreports.LogStatus;

public class TestBase {

	public static WebDriver driver;
	public Browser_utility objectOfBrwsrUtils = new Browser_utility();
	public String userid;
	public String password;
	public Report_Utility obReport = new Report_Utility();
	public TestListner objectTestListner = new TestListner();
	public propertyLoader objectofProperty = new propertyLoader();
	public Common_Utility objectOfcommonUtil = new Common_Utility();

	
		@BeforeSuite
		public void settinglog4j() throws Exception {
			objectofProperty.loadlog4jPropertyFile(System.getProperty("user.dir")+"\\src\\main\\resources\\properties\\log4j.properties");
		}

	@BeforeTest
	public void launchbrowsr() throws Exception {

		objectOfBrwsrUtils.launchbrwsr();
		//sending credential before every test.
		objectOfBrwsrUtils.dataforCredential();
		userid = objectOfBrwsrUtils.userid;
		password = objectOfBrwsrUtils.password;
	}

	@AfterTest
	public void closebrowser() {
		objectOfBrwsrUtils.Tearoff();
//		obReport.EndTestCase();
//		obReport.EndReport();
	}
}
